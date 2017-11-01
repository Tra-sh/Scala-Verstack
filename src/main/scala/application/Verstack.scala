package application

object XX extends App {
  def isGoodEnough(x:Double, guess: Double) = 
    Math.round(guess*guess*1000).toDouble/1000 == x


  def improve(x:Double, guess: Double) = 
    (x / guess + guess) / 2 

  def sqrtIter(x: Double, guess: Double = 1): Double =
    if (isGoodEnough(x, guess)) Math.round(guess*10000).toDouble/10000
    else sqrtIter(x, improve(x, guess))
}