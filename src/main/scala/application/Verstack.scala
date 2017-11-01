package application

object XX extends App {

  def sqrt(x: Double, y: Double = 1): Stream[Double] = 
    Stream.cons(y, sqrt(x, ((x / y) + y) / 2))

}