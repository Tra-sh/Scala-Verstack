package application

object X extends App {

  def time[R](block: => R): Unit = {  
    val t0 = System.currentTimeMillis()
    val result = block    // call-by-name
    val t1 = System.currentTimeMillis()
    println(s"Execution time: ${t1 - t0} ms")
  }

  @scala.annotation.tailrec
  def factorial(x:BigInt, acc:BigInt = 1):BigInt = x match {
    case x:BigInt if x <= 1 => acc
    case x:BigInt if x > 1 => factorial(x - 1, x * acc)
  }

  //time {factorial(100000)}
  val content = factorial(1000000).toString
  val filename = "factorial-scala.txt"

  // PrintWriter
  import java.io._
  val pw = new PrintWriter(new File(filename))
  pw.write(content)
  pw.close

}
