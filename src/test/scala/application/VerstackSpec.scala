package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  it should "use pattern matching for checking int of Range" in {
    val between = (temperature:Int, low:Int, high:Int) => temperature match {
      case temp if `low` until `high` contains temp => true
      case _ => false
    }
    between(70, 80, 90) shouldEqual false
    between(70, 60, 90) shouldEqual true
  }
}