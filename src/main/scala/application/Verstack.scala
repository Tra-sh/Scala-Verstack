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
}
