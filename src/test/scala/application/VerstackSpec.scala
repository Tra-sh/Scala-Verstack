package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  
  it should "Pattern Matching Case Classes" in {
    assignResult(true) shouldEqual 42
    assignResult(false) shouldEqual 47
  }

}