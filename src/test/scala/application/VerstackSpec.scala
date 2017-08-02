package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  
  it should "Pattern Matching Case Classes" in {
    val travelers = Vector(
      Passenger("Harvey", "Rabbit"),
      Passenger("Dorothy", "Gale"))
    val trip = Vector(
      Train(travelers, "Reading"),
      Bus(travelers, 100))
    val trip2 = Vector(Train(travelers, "Reading"), Plane(travelers, "B757"), Bus(travelers, 100))

    travel(trip2(1)) shouldEqual "Plane B757 " + "Vector(Passenger(Harvey,Rabbit), " + "Passenger(Dorothy,Gale))"
    travel2(Passenger("Sally", "Marie")) shouldEqual "Sally is walking"

    case class Kitten(name:String)
    travel2(Kitten("Kitty")) shouldEqual "Kitten(Kitty) is in limbo!"
    }

}