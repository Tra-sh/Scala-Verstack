package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  
  it should "override" in {
    val forTwo = Bicycle(2)
    forTwo.toString shouldEqual "Bicycle built for 2"
  }

  it should "cycle class" in {
    val c1 = Cycle(1)
    c1.toString shouldEqual "Unicycle"
    val c2 = Cycle(2)
    c2.toString shouldEqual "Bicycle"
    val cn = Cycle(5)
    cn.toString shouldEqual "Cycle with 5 wheels"
  }

}