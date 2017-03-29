package application

object X extends App {
}

class SimpleTime(val hours:Int, val minutes:Int) {
}

class SimpleTime2(val hours:Int = 0, val minutes:Int = 0) {
}

class Planet(name:String, description:String, moons:Int = 1) {
  def hasMoon = (moons > 0)
}
