package application

object XX extends App {

  object MonthName extends Enumeration {
    type MonthName = Value
    val January = Value(1)
    val February, March, April, May, June, July, August, September, October, November, December = Value

    def monthNumber(n: MonthName) = n.id

    def season(n: MonthName) = n.id match {
      case 12 | 1 | 2 => "Winter"
      case 3 | 4 | 5 => "Spring"
      case 6 | 7 | 8 => "Summer"
      case 9 | 10 | 11 => "Autumn"
    }
  }

  object Entry extends Enumeration {
    type Entry = Value
    val Nope, X, O = Value
  }
  import Entry._

  case object Cell {
    var entry = Entry.Nope
    def set(e: Entry) = e match {
      case X | O if entry == Nope => {
        entry = e; 
        "successful move"
      }
      case _ => "invalid move"
    }
  } 

  class Grid {
    val cells = Vector.fill(3,3)(Cell)
    def play(e:Entry , x:Int, y:Int):String = 
      if ((0 <= x && x <= 2) && (0 <= y && y <= 2)) 
        cells(x)(y).set(e)
      else "invalid move"
  }
}