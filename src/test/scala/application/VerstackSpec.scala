package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  it should "tea" in {
    val tea = new Tea2
    tea.describe shouldEqual "Earl Grey"
    tea.calories shouldEqual 0
    tea.name shouldEqual "Earl Grey"
  }
  it should "lemonZinger" in {
    val lemonZinger = new Tea2(decaf = true, name="Lemon Zinger")
    lemonZinger.describe shouldEqual "Lemon Zinger decaf"
    lemonZinger.calories shouldEqual 0
    lemonZinger.decaf shouldEqual true
  }
  it should "sweetGreen" in {
    val sweetGreen = new Tea2(name="Jasmine Green", sugar=true)
    sweetGreen.describe shouldEqual "Jasmine Green + sugar"
    sweetGreen.calories shouldEqual 16
    sweetGreen.sugar shouldEqual true
  }
  it should "teaLatte" in {
    val teaLatte = new Tea2(sugar=true, milk=true)
    teaLatte.describe shouldEqual "Earl Grey + milk + sugar"
    teaLatte.calories shouldEqual 116
    teaLatte.milk shouldEqual true
  }
}


