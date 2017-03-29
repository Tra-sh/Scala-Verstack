package application

import org.scalatest._
import application._

class VerstackSpec extends FlatSpec with Matchers {
  "SimpleTime" should "work" in {
    val t = new SimpleTime( hours=5, minutes=30 )
    t.hours shouldEqual 5
    t.minutes shouldEqual 30
  }
  "SimpleTime2" should "work" in {
    val t2 = new SimpleTime2( hours=10 )
    t2.hours shouldEqual 10
    t2.minutes shouldEqual 0
  }
  "Planet" should "work" in {
    val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
    p.hasMoon shouldEqual false
  }

}


