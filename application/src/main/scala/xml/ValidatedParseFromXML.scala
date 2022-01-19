package xml

import domain.{Common, Player, presentation}
import domain.presentation.PlayerStats
import serde.RawParseFromXML

import scala.xml.Elem

object ValidatedParseFromXML {

  def apply(xml: Elem) = {
    val presentationData = RawParseFromXML(xml)
    Validate(presentationData) match {
      case Left(value) => Left(value)
      case Right(_)    => Right(presentationData)
    }
  }

}
