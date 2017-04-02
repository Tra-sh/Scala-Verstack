package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  it should "have gnomes again" in {
    val gnome = new GardenGnome(20.0, 110.0, false)
    gnome.show() shouldEqual "20.0 110.0 false true"
    val bob = new GardenGnome("Bob")
    bob.show() shouldEqual "15.0 100.0 true true"
  }
  it should "do some magick" in {
    val gnome = new GardenGnome(20.0, 50.0, false)
    gnome.show(87) shouldEqual "Poof! 87 false true"
    val bob = new GardenGnome("Bob")
    bob.show(25) shouldEqual "Poof! 25 true true"
  }
  it should "be reworked with labels" in {
    val gnome = new LabeledGardenGnome(20.0, 110.0, false)
    gnome.show() shouldEqual "height: 20.0 " + "weight: 110.0 happy: false painted: true"
    val bob = new LabeledGardenGnome("Bob")
    bob.show() shouldEqual "height: 15.0 weight: 100.0 true true"
  }

}

