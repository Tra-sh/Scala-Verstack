package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  it should "return a vector of double" in {
    explicitDouble(1.0, 2.0, 3.0) shouldEqual Vector(1.0, 2.0, 3.0)
  }
  it should "do some extra work for me" in {
    explicitList(Vector(10.0, 20.0)) shouldEqual List(10.0, 20.0)
    explicitList(Vector(1, 2, 3)) shouldEqual List(1.0, 2.0, 3.0)
    explicitSet(Vector(10.0, 20.0, 10.0)) shouldEqual Set(10.0, 20.0)
    explicitSet(Vector(1, 2, 3, 2, 3, 4)) shouldEqual Set(1.0, 2.0, 3.0, 4.0)
  }
  it should "pattern matching" in {
    val weather = Vector(100, 80, 20, 100, 20)
    println(historicalData(weather))
    historicalData(weather) shouldEqual "Sunny=2, Mostly Sunny=1, Mostly Cloudy=2"
  }
}

