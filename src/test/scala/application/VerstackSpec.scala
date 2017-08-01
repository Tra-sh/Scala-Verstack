package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  
  it should "ever work again" in {
    calculate(0) shouldEqual 1
    calculate(1) shouldEqual 2
    }

}