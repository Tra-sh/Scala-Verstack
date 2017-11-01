package application
// shouldEqual

import org.scalatest._
import application._
import application.XX._

class ThisApp extends FlatSpec with Matchers {
  
  it should "sqrt" in {
    sqrt(2)(0) shouldEqual 1
    sqrt(2)(1) shouldEqual 1.5
  }

}