package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {

  it should "Base Class apes" in {
    val c = new BonoboC(111, 222) 
    c.weight shouldEqual 111
    c.age shouldEqual 222

    val roaringApe = new GreatApe(112, 9, "Male")
    roaringApe.myWords shouldEqual Vector("Roar")
  }

  it should "Base Class houses" in {
    val h = new Home
    h.toString shouldEqual "Where the heart is"
    h.heart shouldEqual true

    val v = new VacationHouse("MI","49431",6,8)
    v.toString shouldEqual "Rented house in MI for months of " + "June through August."
  }
  
  it should "Base Class trip" in {
    val t = new Trip("Detroit","Houston", "5/1/2012","6/1/2012")
    val a = new AirplaneTrip("Detroit", "London","9/1/1939", "10/31/1939","Superman")

    val cities = Vector("Boston", "Albany","Buffalo","Cleveland", "Columbus","Indianapolis", "St. Louis", "Kansas City", "Denver","Grand Junction", "Salt Lake City", "Las Vegas", "Bakersfield","San Francisco")

    val c = new CarTrip(cities, "6/1/2012","7/1/2012")

    c.origination shouldEqual "Boston"
    c.destination shouldEqual "San Francisco"
    c.startDate shouldEqual "6/1/2012"
    t.toString shouldEqual "From Detroit to Houston:" + " 5/1/2012 to 6/1/2012"
    c.toString shouldEqual "From Boston to San Francisco:" + " 6/1/2012 to 7/1/2012"
  }
}