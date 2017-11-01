package application
// shouldEqual

import org.scalatest._
import application._
import application.XX._

class ThisApp extends FlatSpec with Matchers {
  
  it should "and" in {
    and(true, true) shouldEqual true
    and(false, true) shouldEqual false
    and(true, false) shouldEqual false
    and(false, false) shouldEqual false
  }

  it should "or" in {
    or(true, true) shouldEqual true
    or(false, true) shouldEqual true
    or(true, false) shouldEqual true
    or(false, false) shouldEqual false
  }
}