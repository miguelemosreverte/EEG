package application
import domain.presentation._
object PlayerStatistics {

  def topNPlayers(parseResult: Map[Player, PlayerStats])(
      statistic: String,
      N: Int
  ): Seq[RankedPlayer] =
    parseResult
      .map { case (player, attributes) =>
        (
          player,
          attributes.statistics
            .filter { case (statisticName, statisticValue) =>
              statisticName == statistic
            }
            .values
            .headOption
        )

      }
      .toSeq
      .collect { case (player, Some(statisticValue)) =>
        (player, statisticValue)
      }
      .sortBy { case (player, statistic) =>
        statistic
      }
      .reverse
      .take(N)
      .zipWithIndex
      .map { case ((player, statistic), ranking) =>
        RankedPlayer(player, statistic, ranking + 1)
      }

}
