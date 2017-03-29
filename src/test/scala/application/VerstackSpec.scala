package application

import org.scalatest._



class VerstackSpec extends FlatSpec with Matchers {
  "matchColor" should "work well" in {
    Verstack.matchColor("white") shouldEqual "UNKNOWN COLOR: white"
    Verstack.matchColor("blue") shouldEqual "BLUE"
    Verstack.matchColor("green") shouldEqual "GREEN"
    Verstack.matchColor("red") shouldEqual "RED"
  }
  "oneOrTheOther" should "also work well" in {
    lazy val v = Vector(1)
    lazy val v2 = Vector(3, 4)
    Verstack.oneOrTheOther(v == v.reverse) shouldEqual "True!"
    Verstack.oneOrTheOther(v2 == v2.reverse) shouldEqual "It's false"
  }
  
}


