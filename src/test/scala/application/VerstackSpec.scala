package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  
  it should "override" in {
    val forTwo = Bicycle(2)
    forTwo.toString shouldEqual "Bicycle built for 2"
  }

}