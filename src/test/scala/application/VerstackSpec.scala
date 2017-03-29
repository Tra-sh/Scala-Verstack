package application

import org.scalatest._
import application._

class VerstackSpec extends FlatSpec with Matchers {
  "SimpleTime" should "work" in {
    val t = new SimpleTime( hours=5, minutes=30 )
    t.hours shouldEqual 5
    t.minutes shouldEqual 30
  }
}


