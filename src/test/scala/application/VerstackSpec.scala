package application
// shouldEqual

import org.scalatest._
import application._
import application.XX._

class ThisApp extends FlatSpec with Matchers {
  
  it should "sqrtIter" in {
    sqrtIter(2) shouldEqual 1.414213562373095
    sqrtIter(4) shouldEqual 2
    sqrtIter(10000) shouldEqual 100
    sqrtIter(0.001) shouldEqual 0.03162277660168379
  }

}