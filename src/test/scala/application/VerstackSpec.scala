package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {

  it should "vocalize" in {
    val ape1 = new GreatApe
    ape1.vocalize shouldEqual "Grrr!"
    val ape2 = new Bonobo
    ape2.vocalize shouldEqual "Grrr!"
    val ape3 = new Chimpanzee
    ape3.vocalize shouldEqual "Grrr!"
  }
  
  it should "says" in {
    says(new GreatApe) shouldEqual "says Grrr!"
    says(new Bonobo) shouldEqual "says Grrr!"
    says(new Chimpanzee) shouldEqual "says Grrr!"
    says(new BonoboB) shouldEqual "says Grrr!"
  }

  it should "cycles" in {
    val c = new Cycle
    c.ride shouldEqual "Riding"
    val b = new Bicycle
    b.ride shouldEqual "Riding"
    b.wheels shouldEqual 2
  }
  




}