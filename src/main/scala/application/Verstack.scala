package application

object Verstack extends App {
  def matchColor(color: String):String = color match {
    case "blue"|"green"|"red" => color.toUpperCase
    case _ => s"UNKNOWN COLOR: ${color}"
  }
  def oneOrTheOther(exp:Boolean):String = exp match {
    case true => "True!"
    case _ => "It's false"
  }
  def checkTruth(exp1:Boolean, exp2:Boolean):String = Vector(exp1, exp2) match {
    case Vector(true, true) => "Both are true"
    case Vector(false, false) => "Both are false"
    case Vector(true, false) => "First: true, second: false"
    case Vector(false, true) => "First: false, second: true"
  }
}


