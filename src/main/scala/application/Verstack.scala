package application

object X extends App {

  @scala.annotation.tailrec
  def factorial(x:BigInt, accumulator:BigInt = 1):BigInt = x match {
    case x:BigInt if x == 1 => accumulator
    case x:BigInt if x > 1 => factorial(x - 1, x * accumulator)
    case _ => 0
  }
}



