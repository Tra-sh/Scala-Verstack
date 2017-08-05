package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {

  it should "tuples" in {
    val tuple1 = (65, "Sunny", "Stars")
    val (temp1, sky1, view1) = tuple1
    temp1 shouldEqual 65
    sky1 shouldEqual "Sunny"
    view1 shouldEqual "Stars"
  }

  it should "tuples 2" in {
    val tuple2 = (78, "Cloudy", "Satellites")
    val (temp2, ski2, view2) = tuple2
    temp2 shouldEqual 78
    ski2 shouldEqual "Cloudy"
    view2 shouldEqual "Satellites"
  } 

  it should "tuples 3" in {
    val tuple3 = (51, "Blue", "Night")
    val (temp3, ski3, view3) = tuple3
    temp3 shouldEqual 51
    ski3 shouldEqual "Blue"
    view3 shouldEqual "Night"
  } 

  it should "tuples 45 50" in {
    val info = (50, 45)
    info._1 shouldEqual 50
    info._2 shouldEqual 45
  } 

  it should "weather" in {
    weather(81, 45) shouldEqual ("Hot", "Humid")
    weather(50, 45) shouldEqual ("Temperate", "Humid")
    val (heat1, moisture1) = weather(81, 45)
    heat1 shouldEqual "Hot"
    moisture1 shouldEqual "Humid"
    val (heat2, moisture2) = weather(27, 55)
    heat2 shouldEqual "Cold"
    moisture2 shouldEqual "Damp"
  } 

}