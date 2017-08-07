package application

object XX extends App {
  object Level extends Enumeration {
    type Level = Value
    val Overflow, High, Medium, Low, Empty = Value
    val Draining, Pooling, Dry = Value
  }

  import Level._

  def checkLevel(level:Level)= level match {
    case Overflow => ">>> Overflow!"
    case Empty | Dry => "Alert"
    case Pooling => "Warning!"
    case other =>  s"Level $level OK"
  }
}