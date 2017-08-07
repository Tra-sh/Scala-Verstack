package application
// shouldEqual

import org.scalatest._
import application._
import application.XX._

class ThisApp extends FlatSpec with Matchers {
  
  it should "Abstract classes" in {
    val duck = new Duck
    duck.food shouldEqual "plants"
    val cow = new Cow
    cow.food shouldEqual "grass"

    val chicken = new Chicken
    chicken.food shouldEqual "insects"
    val pig = new Pig
    pig.food shouldEqual "anything"

    
    val num = new NumericAdder(5)
    num.add(10) shouldEqual 15
  }
}