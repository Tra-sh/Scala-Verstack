package application

object X extends App {

  class GreatApe(
    val weight: Double, 
    val age: Int, 
    val gender: String = "Female") {
    def myWords = Vector("Roar")
  }

  class Bonobo(weight:Double, age:Int)
    extends GreatApe(weight, age)

  class Chimpanzee(weight:Double, age:Int)
    extends GreatApe(weight, age)

  class BonoboB(weight:Double, age:Int)
    extends Bonobo(weight, age)

  class BonoboC(weight:Double, age:Int) 
    extends BonoboB(weight, age)

  class Bonobo2(weight:Double, age:Int, gender: String) 
    extends GreatApe(weight, age, gender) {
      override def myWords = Vector("Roar", "Hello")
    }

  def display(ape:GreatApe) = s"weight: ${ape.weight} age: ${ape.age}" 

  class Trip(
    val origination: String, 
    val destination: String, 
    val startDate: String,
    val endDate: String) {

    override def toString = s"From ${origination} to ${destination}: ${startDate} to ${endDate}"
    }

  class AirplaneTrip(
    origination: String, 
    destination: String, 
    startDate: String,
    endDate: String,
    movie: String) extends Trip(origination, destination, startDate, endDate) {
      override def toString = s"${super.toString}, we watched ${movie}"
    }
    
  class CarTrip(
    origination: String, 
    destination: String, 
    startDate: String,
    endDate: String) extends Trip(origination, destination, startDate, endDate) {

    def this(
      listOfCities: Vector[String], 
      startDate: String, 
      endDate: String) = this(listOfCities.head, listOfCities.last, startDate, endDate)
  }
}