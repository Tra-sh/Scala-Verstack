package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  it should "reduce" in {
    sumIt(1, 2, 3) shouldEqual 6
    sumIt(45, 45, 45, 60) shouldEqual 195
  }
}