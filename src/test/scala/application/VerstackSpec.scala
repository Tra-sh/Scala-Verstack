package application

import org.scalatest._
import application._
import application.X._

class VerstackSpec extends FlatSpec with Matchers {
  "Overloading's" should "work" in {
    val mo1 = new Overloading1
    val mo2 = new Overloading2
    mo1.f() shouldEqual 88
    mo1.f(11) shouldEqual 13
    mo2.f() shouldEqual 99
    mo2.f(11) shouldEqual 14
  }
  "Overloading" should "work ok for methods also" in {
    f() shouldEqual 0
    f(1) shouldEqual 1
    f(1, 2) shouldEqual 3
    f(1, 2, 3) shouldEqual 6
    f(1, 2, 3, 4) shouldEqual 10
  }
}


