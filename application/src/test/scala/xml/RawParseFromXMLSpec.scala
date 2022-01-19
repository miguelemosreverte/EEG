package xml

import domain.presentation._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{be, convertToAnyMustWrapper}
import serde.RawParseFromXML

import scala.xml.XML

class RawParseFromXMLSpec extends AnyFlatSpec {

  val stats = RawParseFromXML(dataset.apply)
  "RawParseFromXML" should "compile the dinamic attributes into players and stats" in {
    stats(dataset.player) must be(
      PlayerStats(Map("leftside_pass" -> 1, "accurate_pass" -> 6))
    )
  }
}
