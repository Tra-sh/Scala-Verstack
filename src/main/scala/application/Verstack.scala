package application

object X extends App {
  def sumIt(v:Int*) = v.reduce((a, b) => a + b)
}



