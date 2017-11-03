package application

object XX extends App {

  def isGoodEnough(x: Double, guess: Double) = 
    //(guess*guess - x).abs < 0.000000000000001
    guess*guess == x

  def improve(x: Double, guess: Double) = 
    (x / guess + guess) / 2 

  def sqrtIter(x: Double, guess: Double = 1): Double =
    if (isGoodEnough(x, guess)) guess
    else sqrtIter(x, improve(x, guess))
}