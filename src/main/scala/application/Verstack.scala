package application

object XX extends App {

  sealed trait Color

  case object Red extends Color
  case object Green extends Color
  case object Blue extends Color

  object Color {
    val values = Vector(Red, Green, Blue)
  }

  def display(c: Color) = c match {
    case Red => s"It's $c"
    case Green => s"It's $c"
    case Blue => s"It's $c"
  }

  object EnumColor extends Enumeration {
    type EnumColor = Value
    val Red2, Green2, Blue2 = Value
  }

  import EnumColor._

  def display2(c: EnumColor) = c match {
    case Red2 => s"It's $c"
    case Green2 => s"It's $c"
    case Blue2 => s"It's $c"
  }

}