package automation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{be, convertToAnyMustWrapper}

class RebuildFromDocumentationSpec extends AnyFlatSpec {
  "RebuildFromDocumentation" should "inferr case class definitions given sets of attributes" in {
    RebuildFromDocumentation.provideExamples(
      playerAttributes = Set("a", "b", "c"),
      teamAttributes = Set("a", "b", "d")
    ) must be(
      List(
        s"""
           |case class Common(
           |	a: Int = 0,
           |	b: Int = 0
           |)
           |""".stripMargin,
        s"""
           |case class Player(
           |	c: Int = 0
           |)
           |""".stripMargin,
        s"""
           |case class Team(
           |	d: Int = 0
           |)
           |""".stripMargin
      )
    )
  }
}
