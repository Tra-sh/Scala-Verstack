package application

import org.scalatest._
import application._

class VerstackSpec extends FlatSpec with Matchers {
  "Family" should "return correct size" in {
    val family1 = new Family("Mom", "Dad", "Sally", "Dick")
    val family2 = new Family("Dad", "Mom", "Harry")
    family1.familySize() shouldEqual 4
    family2.familySize() shouldEqual 3
  }
  "FlexibleFamily" should "work well" in {
      val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
      family3.familySize() shouldEqual 4
      val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
      family4.familySize() shouldEqual 3
      val familyNoKids = new FlexibleFamily("Mom", "Dad")
      familyNoKids.familySize() shouldEqual 2
  }
  "Cup5" should "work well" in {
    val cup5 = new Cup5(0)
    cup5.increase(20, 30, 50, 20, 10, -10, -40, 10, 50) shouldEqual 100
    cup5.increase(10, 10, -10, 10, 90, 70, -70) shouldEqual 30
  }
  
}


