package application

import org.scalatest._

import application.Verstack._

class VerstackSpec extends FlatSpec with Matchers {
  "matchColor" should "work well" in {
    matchColor("white") shouldEqual "UNKNOWN COLOR: white"
    matchColor("blue") shouldEqual "BLUE"
    matchColor("green") shouldEqual "GREEN"
    matchColor("red") shouldEqual "RED"
  }
  "oneOrTheOther" should "also work well" in {
    lazy val v = Vector(1)
    lazy val v2 = Vector(3, 4)
    oneOrTheOther(v == v.reverse) shouldEqual "True!"
    oneOrTheOther(v2 == v2.reverse) shouldEqual "It's false"
  }
  "checkTruth" should "also work well" in {
    checkTruth(true || false, true) shouldEqual
    "Both are true"
    checkTruth(1 > 0 && -1 < 0, 1 == 2) shouldEqual
    "First: true, second: false"
    checkTruth(1 >= 2, 1 >= 1) shouldEqual
    "First: false, second: true"
    checkTruth(true && false, false && true) shouldEqual
    "Both are false"
  }
}


