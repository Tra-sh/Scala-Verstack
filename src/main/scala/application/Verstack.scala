package application

object X extends App {
  case class Bus(passengers: Vector[Passenger], capacity: Int)
  case class Train(travelers: Vector[Passenger], line: String)
  case class Plane(passengers: Vector[Passenger], name: String)
  case class Passenger(first: String, last: String)

  def travel(transport:Any):String = {
    transport match {
      case Train(travelers, line) => s"Train line $line $travelers"
      case Bus(travelers, seats) => s"Bus size $seats $travelers"
      case Plane(passengers, name) => s"Plane $name $passengers"
      case Passenger => "Walking along"
      case what => s"$what is in limbo!"
    }
  }

  def travel2(transport:Any):String = {
    transport match {
      case Train(travelers, line) => s"Train line $line $travelers"
      case Bus(travelers, seats) => s"Bus size $seats $travelers"
      case Plane(passengers, name) => s"Plane $name $passengers"
      case Passenger(first, last) => s"$first is walking"
      case what => s"$what is in limbo!"
    }
  }
}