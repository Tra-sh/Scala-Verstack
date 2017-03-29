package application

import org.scalatest._
import application._
import application.X._

class ThisApplication extends FlatSpec with Matchers {
  it should "Earl Grey" in {
    val tea = new Tea
    tea.describe shouldEqual "Earl Grey"
    tea.calories shouldEqual 0
  }
  it should "Lemon Zinger" in {
    val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
    lemonZinger.describe shouldEqual "Lemon Zinger decaf"
    lemonZinger.calories shouldEqual 0
  }
  it should "Jasmine Green" in {
    val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
    sweetGreen.describe shouldEqual "Jasmine Green + sugar"
    sweetGreen.calories shouldEqual 16
  }
  it should "Earl Grey + milk + sugar" in {
    val teaLatte = new Tea( sugar=true, milk=true)
    teaLatte.describe shouldEqual "Earl Grey + milk + sugar"
    teaLatte.calories shouldEqual 116
  }
}
