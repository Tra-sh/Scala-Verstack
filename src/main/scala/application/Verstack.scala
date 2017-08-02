package application

object X extends App {
  case class Bus(passengers: Vector[Passenger], capacity: Int)
  case class Train(travelers: Vector[Passenger], line: String)
  case class Plane(passengers: Vector[Passenger], name: String)
  case class Passenger(first: String, last: String)

  def assignResult(arg:Boolean) = if(arg) 42 else 47
  
}