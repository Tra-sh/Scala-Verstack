package application

object X extends App {
}

class Dimension(var height: Int, var width: Int)

class Info(var name:String, var description:String)

class SimpleTime(val hours:Int, val minutes:Int) {
  def subtract(b:SimpleTime): SimpleTime = {
    val diff = (hours * 60 + minutes) - (b.hours * 60 + b.minutes)
    if (diff > 0) {
      new SimpleTime(diff / 60, diff % 60)
    } else {
      new SimpleTime(0, 0)
    }
  }
}

class SimpleTimeDefault(val hours:Int, val minutes:Int = 0)  {
  def subtract(b:SimpleTimeDefault): SimpleTimeDefault = {
    val diff = (hours * 60 + minutes) - (b.hours * 60 + b.minutes)
    if (diff > 0) {
      new SimpleTimeDefault(diff / 60, diff % 60)
    } else {
      new SimpleTimeDefault(0, 0)
    }
  }
}

class SimpleTimeAux(val hours:Int = 0, val minutes:Int = 0) {
  def this(hours:Int) {
    this(hours, 0)
  }
  def subtract(b:SimpleTimeAux): SimpleTimeAux = {
    val diff = (hours * 60 + minutes) - (b.hours * 60 + b.minutes)
    if (diff > 0) {
      new SimpleTimeAux(diff / 60, diff % 60)
    } else {
      new SimpleTimeAux(0, 0)
    }
  }
}

