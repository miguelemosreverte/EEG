package application

import scopt.OParser

case class Menu(
    path: String = "data.xml",
    statistic: String = "rightside_pass",
    N: Int = 5
)

object Menu {

  def apply(args: Array[String])(withMenu: Menu => Unit): Unit =
    // OParser.parse returns Option[Config]
    OParser.parse(parser1, args, Menu()) match {
      case Some(config) =>
        withMenu(config)
      case _ =>
      // arguments are bad, error message will have been displayed
    }

  import scopt.OParser
  val builder = OParser.builder[Menu]
  val parser1 = {
    import builder._
    OParser.sequence(
      programName("topPlayers"),
      opt[Int]('n', "N")
        .action((n, c) => c.copy(N = n))
        .text("how many results to show"),
      opt[String]('f', "file")
        .required()
        .valueName("<file>")
        .action((path, c) => c.copy(path = path))
        .text("what file to read the xml from"),
      opt[String]('s', "stats")
        .required()
        .valueName("<stat>")
        .action((stat, c) => c.copy(statistic = stat))
        .text("what statistic to show"),
      help("help").text("""
                            |You can execute topPlayers like this:
                            |topPlayers -n 5 --file data.xml --stats rightside_pass 
                            |""".stripMargin)
    )
  }

}
