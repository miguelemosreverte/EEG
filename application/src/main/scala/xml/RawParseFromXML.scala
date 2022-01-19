package serde

import domain.presentation
import domain.presentation.PlayerStats

import scala.collection.immutable
import scala.xml.Elem
import scala.xml.XML

object RawParseFromXML {

  def apply(xml: Elem) = {

    case class Team(id: String, name: String)
    val teams =
      for {
        node <- xml \ "SoccerDocument" \ "Team"
        name <- (node \ "Name").map(_.text).headOption
        id = node \@ "uID"
      } yield Team(id, name)

    case class Player(
        id: String,
        first: String,
        last: String
    )
    val players =
      (for {
        player <- xml \ "SoccerDocument" \ "Team" \ "Player"
        personName <- player \ "PersonName"
        id = player \@ "uID"
        first <- (personName \ "First").map(_.text).headOption
        last <- (personName \ "Last").map(_.text).headOption
      } yield Player(id, first, last))

    case class MatchPlayer(
        playerRef: String,
        attributes: Map[String, Int]
    )
    val matchPlayers =
      (for {
        playerNode <-
          xml \ "SoccerDocument" \ "MatchData" \ "TeamData" \ "PlayerLineUp" \ "MatchPlayer"
        playerRef = playerNode \@ "PlayerRef"
        statNode <- playerNode \ "Stat"
        attribute = statNode \@ "Type"
        attributeValue <- statNode.map(_.text).map(_.toInt)
      } yield (playerRef, attribute, attributeValue))
        .groupMap(_._1)(a => a._2 -> a._3)
        .map(grouped => grouped._1 -> grouped._2.toMap)
        .map(a => MatchPlayer(a._1, a._2))
        .toSeq

    {
      val playersById: Map[String, presentation.Player] = players
        .map(player =>
          player.id -> domain.presentation.Player(player.first, player.last)
        )
        .toMap

      val playersStats: Map[presentation.Player, PlayerStats] =
        matchPlayers.map { matchPlayer =>
          playersById(matchPlayer.playerRef) -> domain.presentation
            .PlayerStats(
              matchPlayer.attributes
            )
        }.toMap

      playersStats
    }

  }

}
