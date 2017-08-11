package application
// shouldEqual

import org.scalatest._
import application._
import application.XX._

class ThisApp extends FlatSpec with Matchers {
  
  it should "Tagging Trait" in {
    Color.values.map(display).toString shouldEqual "Vector(It's Red, It's Green, It's Blue)"
  }

  it should "Enumeration" in {
    EnumColor.Red2.toString shouldEqual "Red2"
    EnumColor.Blue2.toString shouldEqual "Blue2"
    EnumColor.Green2.toString shouldEqual "Green2"
  }
}