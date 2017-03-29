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
  def forecast(percentage: Int):String = percentage match {
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }
  Vector(100, 80, 50, 20, 0, 15) map (i => println(forecast(i)))
}


