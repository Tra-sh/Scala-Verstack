package application

object X extends App {
  case class Bus(passengers: Vector[Passenger], capacity: Int)
  case class Train(travelers: Vector[Passenger], line: String)
  case class Plane(passengers: Vector[Passenger], name: String)
  case class Passenger(first: String, last: String)

  case class Bicycle(riders:Int) {
    override def toString = s"Bicycle built for $riders"
  }

  case class Cycle(wheels:Int) {
    override def toString = wheels match {
      case 1 => "Unicycle"
      case 2 => "Bicycle"
      case 3 => "Tricycle"
      case 4 => "Quadrocycle"
      case n => s"Cycle with $wheels wheels"
    }
    
  }

}