package application

object X extends App {
}

case class Person(first:String, last:String, email:String)

case class Dog(name:String, breed:String)

case class Dimension(var height:Int, var width:Int)

case class SimpleTimeDefault(hours:Int, minutes:Int = 0)  {
  def subtract(b:SimpleTimeDefault): SimpleTimeDefault = {
    val diff = (hours * 60 + minutes) - (b.hours * 60 + b.minutes)
    if (diff > 0) {
      new SimpleTimeDefault(diff / 60, diff % 60)
    } else {
      new SimpleTimeDefault(0, 0)
    }
  }
}
