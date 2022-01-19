package application

import application.PlayerStatisticsSpec.dataset
import application.PlayerStatisticsSpec.dataset.{
  playerA,
  playerB,
  statisticToCompare
}
import domain.presentation._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{be, convertToAnyMustWrapper}

object PlayerStatisticsSpec {
  object dataset {
    val playerA = Player(
      firstName = "playerA.firstname",
      lastName = "playerA.lastName"
    )
    val playerB = Player(
      firstName = "playerB.firstname",
      lastName = "playerB.lastName"
    )
    val statisticToCompare = "statistic"
    val playersStats = Map(
      playerA -> PlayerStats(Map(statisticToCompare -> 10)),
      playerB -> PlayerStats(Map(statisticToCompare -> 1))
    )
  }
}
class PlayerStatisticsSpec extends AnyFlatSpec {
  val stats = PlayerStatistics.topNPlayers(
    dataset.playersStats
  ) _
  "PlayerStatistics" should "rank the players accordint to the statistics" in {
    PlayerStatistics.topNPlayers(
      dataset.playersStats
    )(
      statistic = statisticToCompare,
      N = 5
    ) must be(
      List(
        RankedPlayer(playerA, 10, ranking = 1),
        RankedPlayer(playerB, 1, ranking = 2)
      )
    )
  }
}
