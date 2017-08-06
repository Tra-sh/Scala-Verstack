package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {

  it should "Overriding Methods apes" in {
    val c = new BonoboC(111, 222) 
    c.weight shouldEqual 111
    c.age shouldEqual 222

    val roaringApe = new GreatApe(112, 9, "Male")
    roaringApe.myWords shouldEqual Vector("Roar")

    val chattyBonobo = new Bonobo2(150, 14, "Female")
    chattyBonobo.myWords shouldEqual Vector("Roar", "Hello")
  }
  
  it should "Overriding Methods trip" in {
    val t = new Trip("Detroit","Houston", "5/1/2012","6/1/2012")
    t.toString shouldEqual "From Detroit to Houston:" + " 5/1/2012 to 6/1/2012"

    val a = new AirplaneTrip("Detroit", "London", "9/1/1939", "10/31/1939","Superman")

    val cities = Vector("Boston", "Albany","Buffalo","Cleveland", "Columbus","Indianapolis", "St. Louis", "Kansas City", "Denver","Grand Junction", "Salt Lake City", "Las Vegas", "Bakersfield","San Francisco")
    val c = new CarTrip(cities, "6/1/2012","7/1/2012")
    c.origination shouldEqual "Boston"
    c.destination shouldEqual "San Francisco"
    c.startDate shouldEqual "6/1/2012"
    c.toString shouldEqual "From Boston to San Francisco:" + " 6/1/2012 to 7/1/2012"
  }

  it should "Overriding Methods trip more" in {
    val t = new Trip("Detroit","Houston", "5/1/2012","6/1/2012")
    t.toString shouldEqual "From Detroit to Houston:" + " 5/1/2012 to 6/1/2012"

    val a = new AirplaneTrip("Detroit", "London", "9/1/1939", "10/31/1939", "Superman")
    a.toString shouldEqual "From Detroit to London:" + " 9/1/1939 to 10/31/1939" + ", we watched Superman"

    val cities = Vector("Boston", "Albany","Buffalo","Cleveland", "Columbus","Indianapolis", "St. Louis", "Kansas City", "Denver","Grand Junction", "Salt Lake City", "Las Vegas", "Bakersfield","San Francisco")
    val c = new CarTrip(cities, "6/1/2012","7/1/2012")
    c.origination shouldEqual "Boston"
    c.destination shouldEqual "San Francisco"
    c.startDate shouldEqual "6/1/2012"
    c.toString shouldEqual "From Boston to San Francisco:" + " 6/1/2012 to 7/1/2012"
  }
}