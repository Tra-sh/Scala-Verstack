package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  it should "work with all 2 fields" in {
    val washer1 = new ClothesWasher ("Indesit", 5.5)
    washer1.modelName shouldEqual "Indesit"
    washer1.capacity shouldEqual 5.5
  }
  it should "work with 1 field" in {
    val washer2 = new ClothesWasher (5.5)
    washer2.modelName shouldEqual "Samsung"
    washer2.capacity shouldEqual 5.5
  }
  it should "work with another 1 field" in {
    val washer3 = new ClothesWasher ("Indesit")
    washer3.modelName shouldEqual "Indesit"
    washer3.capacity shouldEqual 2.0
  }
  it should "have overloaded methods" in {
    val washer = new ClothesWasher ("LG 100", 3.6)
    washer.wash(2, 1) shouldEqual "Wash used 2 bleach and 1 fabric softener"
    washer.wash() shouldEqual "Simple wash"
  }
}


