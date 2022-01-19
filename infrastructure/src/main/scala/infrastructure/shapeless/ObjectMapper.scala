package infrastructure.shapeless

import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper}
import com.fasterxml.jackson.module.scala.{
  DefaultScalaModule,
  ScalaObjectMapper
}

import scala.util._

object ObjectMapper {

  def toMap(cc: AnyRef): Map[String, Any] =
    cc.getClass.getDeclaredFields.foldLeft(Map.empty[String, Any]) { (a, f) =>
      f.setAccessible(true)
      a + (f.getName -> f.get(cc))

    }

  def fromMap[T: Manifest](
      map: Map[String, Any]
  ): Either[String, T] = {
    Try {
      lazy val mapper = new ObjectMapper() with ScalaObjectMapper
      mapper.registerModule(DefaultScalaModule)
      mapper.configure(
        DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
        false
      )
      mapper.convertValue[T](map)
    } match {
      case Success(x) => Right(x)
      case Failure(err) => {
        Left(
          s"DeserializationError when decoding: $map"
        )

      }
    }
  }
}
