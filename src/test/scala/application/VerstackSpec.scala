package application

import org.scalatest._
import application._
import application.X._

class VerstackSpec extends FlatSpec with Matchers {
  "Coffee" should "be tasty" in {
    val doubleHalfCaf = new Coffee(shots=2, decaf=1)
    val tripleHalfCaf = new Coffee(shots=3, decaf=2)
    doubleHalfCaf.decaf shouldEqual 1
    doubleHalfCaf.caf shouldEqual 1
    doubleHalfCaf.shots shouldEqual 2
    tripleHalfCaf.decaf shouldEqual 2
    tripleHalfCaf.caf shouldEqual 1
    tripleHalfCaf.shots shouldEqual 3
  }
}


