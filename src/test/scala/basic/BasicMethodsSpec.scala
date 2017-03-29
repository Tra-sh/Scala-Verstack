package basic

import org.scalatest._

object BasicsInstance extends TheBasics 

class BasicMethods extends FlatSpec with Matchers {
  "cube" should "return power 3 on cube's side" in {
    BasicsInstance.cube(2) shouldEqual 8
    BasicsInstance.cube(3) shouldEqual 27
    BasicsInstance.cube(5) shouldEqual 125
  }
  "bang" should "add ! to a string" in {
    BasicsInstance.bang("test string") shouldEqual "test string!"
    BasicsInstance.bang("xxx") shouldEqual "xxx!"
  }
}
