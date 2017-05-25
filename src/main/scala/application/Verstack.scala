package application

object X extends App {

  def time[R](block: => R): Unit = {  
    val t0 = System.currentTimeMillis()
    val result = block    // call-by-name
    val t1 = System.currentTimeMillis()
    println(s"Execution time: ${t1 - t0} ms")
  }

  @scala.annotation.tailrec
  def factorial(x:BigInt, accumulator:BigInt = 1):BigInt = x match {
    case x:BigInt if x == 1 => accumulator
    case x:BigInt if x > 1 => factorial(x - 1, x * accumulator)
    case _ => 0
  }

  //time {factorial(100000)}
}
