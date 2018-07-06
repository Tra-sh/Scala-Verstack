package scalaImpatient
import org.scalatest._

object Exercise extends App {
  def pow(x: Int, n: Int): Int = (x, n) match {
    case (_, 0) => 1
    case (x, n) => x * pow(x, n-1)
  }
}

class ExerciseSpec extends FlatSpec with Matchers {
  import Exercise._
  "pow" should "positive n" in {
    pow(2,1) shouldBe 2
    pow(2,2) shouldBe 4
    pow(2,3) shouldBe 8
    pow(3,3) shouldBe 27
  }
  it should "calculate zero pow" in {
    pow(2,0) shouldBe 1
    pow(1,0) shouldBe 1
    pow(0,0) shouldBe 1
  }
}