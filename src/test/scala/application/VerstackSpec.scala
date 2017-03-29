package application

import org.scalatest._

class VerstackSpec extends FlatSpec with Matchers {
  "Family" should "return correct size" in {
    val family1 = new Family("Mom", "Dad", "Sally", "Dick")
    val family2 = new Family("Dad", "Mom", "Harry")
    family1.familySize() shouldEqual 4
    family2.familySize() shouldEqual 3
  }
}


