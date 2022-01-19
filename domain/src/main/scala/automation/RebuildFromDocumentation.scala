package automation

/*
 *
 * Use this script to automatically generate the model
 * */
private[automation] object RebuildFromDocumentation extends App {

  import scala.io.Source
  val attributes: String => Set[String] = filename =>
    Source.fromResource(filename).getLines.filterNot(_.isBlank).toSet

  val playerResults = attributes("player_results")
  val teamResults = attributes("team_results")
  provideExamples(
    attributes("player_results"),
    attributes("team_results")
  ) foreach println

  def provideExamples(
      playerAttributes: Set[String],
      teamAttributes: Set[String]
  ): Seq[String] = {

    val union = playerAttributes ++ teamAttributes
    val playerResultsOnly = playerAttributes -- teamAttributes
    val teamResultsOnly = teamAttributes -- playerAttributes
    val intersection = union -- playerResultsOnly -- teamResultsOnly

    def asCaseClass(caseClassName: String, attributes: Set[String]): String =
      s"""
         |case class $caseClassName(
         |\t${attributes.map(e => s"$e: Int = 0").mkString(s",\n\t")}
         |)
         |""".stripMargin

    Seq(
      asCaseClass("Common", intersection),
      asCaseClass("Player", playerResultsOnly),
      asCaseClass("Team", teamResultsOnly)
    )
  }

}
