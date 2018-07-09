package scalaImpatient
import org.scalatest._
import collection.mutable.ArrayBuffer

object Exercises3 {
  def genArrBuff(n: Int) = {
    val buff = ArrayBuffer[Int]()
    for (i <- 0 until n) buff += i
    buff
  }
}

class Exercises3Spec extends FlatSpec with Matchers {
  import Exercises3._
  "add from range" should "work" in {
    genArrBuff(3) shouldBe ArrayBuffer(0, 1, 2)
  }
}
