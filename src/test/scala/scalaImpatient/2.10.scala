package scalaImpatient
import org.scalatest._

object Exercise {
  println(Math.pow(1, 0.5))
  println(Math.pow(2, 0.5))
  println(Math.pow(4, 0.5))
  println(Math.pow(8, 0.5))
  def pow(x: Double, n: Double): Double = n match {
    case 0 => 1
    case n if n < 0 => 1 / pow(x, Math.abs(n))
    case n if n >= 1 => x * pow(x, n-1)
    // case n => (pow(x, n/2)) * (pow(x, n/2))
  }
}

class ExerciseSpec extends FlatSpec with Matchers {
  import Exercise._
  "pow" should "positive n" in {
    pow(2, 1) shouldBe 2
    pow(2, 2) shouldBe 4
    pow(2, 3) shouldBe 8
    pow(3, 3) shouldBe 27
  }
  it should "calculate zero pow" in {
    pow(2, 0) shouldBe 1
    pow(1, 0) shouldBe 1
    pow(0, 0) shouldBe 1
  }
  it should "calculate negative pow" in {
    pow(1, -1) shouldBe 1
    pow(2, -1) shouldBe 0.5
    pow(4, -1) shouldBe 0.25
    pow(1, -2) shouldBe 1
    pow(2, -3) shouldBe 0.125
    pow(4, -4) shouldBe 0.00390625
  }
  // it should "calculate positive pow less than 1" in {
  //   pow(1, 0.5) shouldBe 1
  //   pow(2, 0.5) shouldBe 0.5
  //   pow(4, 0.5) shouldBe 0.255
  // }
}
