package application

import xml.ValidatedParseFromXML
import scala.xml.XML

object Main extends App {

  Menu(args) { config =>
    val validated = ValidatedParseFromXML(XML.loadFile(config.path))
    validated.fold(
      validationErrors => validationErrors foreach println,
      { validated =>
        System.out.printf(
          "%-15s %15s %15s %15s %n",
          "<POSITION_IN_RANKING>",
          "<FIRST NAME>",
          "<LAST NAME>",
          "<STATISTIC_VALUE>"
        )
        PlayerStatistics
          .topNPlayers(validated)(config.statistic, config.N)
          .foreach(e =>
            System.out.printf(
              "%-15s %15s %15s %15s %n",
              e.ranking,
              e.player.firstName,
              e.player.lastName,
              e.statisticValue
            )
          )
      }
    )
  }

}
