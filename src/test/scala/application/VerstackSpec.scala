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
    val earth = new Planet(moons = 1, name = "Earth", description = "a hospitable planet")
    earth.hasMoon shouldEqual true
  }
  "Item" should "work" in {
    val flour = new Item(name="flour", 4)
    flour.cost(grocery=true) shouldEqual 4
    val sunscreen = new Item(name="sunscreen", 3)
    sunscreen.cost() shouldEqual 3.3
    val tv = new Item(name="television", 500)
    tv.cost(rate = 0.06) shouldEqual 530
  }

}


