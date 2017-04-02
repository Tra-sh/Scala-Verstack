package application

object X extends App {
}

class GardenGnome(val height:Double, val weight:Double, val happy:Boolean) {
  var painted = true
  def magic(level:Int):String = s"Poof! $level"
  def this(height:Double) {
    this(height, 100.0, true)
  }
  def this(name:String) = {
    this(15.0)
  }
  def show():String = s"$height $weight $happy $painted"
  def show(level:Int) = s"${magic(level)} $happy $painted"
}


class LabeledGardenGnome(val height:Double, val weight:Double, val happy:Boolean) {
  var painted = true
  var otherOptionsString = s"happy: $happy painted: $painted"
  def magic(level:Int):String = s"Poof! $level"
  def this(height:Double) {
    this(height, 100.0, true)
  }
  def this(name:String) = {
    this(15.0)
    otherOptionsString = s"$happy $painted"
  }
  def show():String = s"height: $height weight: $weight $otherOptionsString"
  def show(level:Int) = s"${magic(level)} $otherOptionsString"
}
