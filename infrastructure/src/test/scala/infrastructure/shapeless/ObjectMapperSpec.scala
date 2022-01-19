package infrastructure.shapeless

import infrastructure.shapeless.ObjectMapperSpec.dataset.Person
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.{be, convertToAnyMustWrapper}

object ObjectMapperSpec {
  object dataset {
    case class Person(name: String, age: Int)
  }
}
class ObjectMapperSpec extends AnyFlatSpec {
  "ObjectMapper" should "transform case class to Map" in {
    infrastructure.shapeless.ObjectMapper.toMap(Person("a", 10)) must be(
      Map("name" -> "a", "age" -> 10)
    )
  }
  "ObjectMapper" should "transform Map to case class" in {
    infrastructure.shapeless.ObjectMapper
      .fromMap[Person](Map("name" -> "a", "age" -> 10)) must be(
      Right(Person("a", 10))
    )
  }
  "ObjectMapper" should "optimistic provide default values when transforming Map to case class" in {
    infrastructure.shapeless.ObjectMapper
      .fromMap[Person](Map()) must be(
      Right(Person(null, 0))
    )
  }
  "ObjectMapper" should "fail with Left if experiencing failure" in {
    infrastructure.shapeless.ObjectMapper
      .fromMap[Person](Map("name" -> "a", "age" -> "invalid age")) must be(
      Left(
        "DeserializationError when decoding: Map(name -> a, age -> invalid age)"
      )
    )
  }
}
