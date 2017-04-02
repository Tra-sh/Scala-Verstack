package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  it should "be a Person" in {
    val p = Person("Jane", "Smile", "jane@smile.com")
    p.first shouldEqual "Jane"
    p.last shouldEqual "Smile"
    p.email shouldEqual "jane@smile.com"
  }
  it should "live in Vector" in {
    val people = Vector(
    Person("Jane","Smile","jane@smile.com"),
    Person("Ron","House","ron@house.com"),
    Person("Sally","Dove","sally@dove.com"))
    people(0).toString shouldEqual "Person(Jane,Smile,jane@smile.com)"
    people(1).toString shouldEqual "Person(Ron,House,ron@house.com)"
    people(2).toString shouldEqual "Person(Sally,Dove,sally@dove.com)"
  }
  it should "have dogs" in {
    val dogs = Vector(
      Dog("Fido", "Golden Lab"),
      Dog("Ruff", "Alaskan Malamute"),
      Dog("Fifi", "Miniature Poodle"))
    dogs(0).toString shouldEqual "Dog(Fido,Golden Lab)"
    dogs(1).toString shouldEqual "Dog(Ruff,Alaskan Malamute)"
    dogs(2).toString shouldEqual "Dog(Fifi,Miniature Poodle)"
  }
  it should "have dimension" in {
    val c = new Dimension(5,7)
    c.height shouldEqual 5
    c.height = 10
    c.height shouldEqual 10
    c.width = 19
    c.width shouldEqual 19
  }
  it should "have Time again" in {
    val anotherT1 = new SimpleTimeDefault(10, 30)
    val anotherT2 = new SimpleTimeDefault(9)
    val anotherST = anotherT1.subtract(anotherT2)
    anotherST.hours shouldEqual 1
    anotherST.minutes shouldEqual 30
    val anotherST2 = new SimpleTimeDefault(10).subtract(new SimpleTimeDefault(9, 45))
    anotherST2.hours shouldEqual 0
    anotherST2.minutes shouldEqual 15
  }
}


