package application
// shouldEqual

import org.scalatest._
import application._
import application.XX._

class ThisApp extends FlatSpec with Matchers {
  
  it should "Traits: BatteryPower" in {
    val battery = new Battery
    battery.monitor(80) shouldEqual "green"
    battery.monitor(30) shouldEqual "yellow"
    battery.monitor(10) shouldEqual "red"
  }

  it should "Toy" in {
    val toy = new BatteryPoweredToy
    toy.monitor(50) shouldEqual "green"

    val toy2 = new Toy with BatteryPower
    toy2.monitor(50) shouldEqual "green"
  }
}