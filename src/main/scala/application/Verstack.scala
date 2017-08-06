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

  def display(ape:GreatApe) = s"weight: ${ape.weight} age: ${ape.age}" 

  class House(
    val address:String,
    val state:String, 
    val zip:String) {

    def this(state:String, zip:String) = this("address?", state, zip)
    def this(zip:String) = this("address?", "state?", zip)
  }

  class Home
    extends House("00000") {
    val heart = true
    override def toString = "Where the heart is"
  }

  class VacationHouse(
    state: String, 
    zip: String, 
    val startMonth: Int, 
    val endMonth:Int) 
    extends House(state, zip) {

      def monthNameByNumber(n: Int) = n match {
        case 1 => "Jan"
        case 2 => "F"
        case 3 => "Mr"
        case 4 => "Ap"
        case 5 => "May"
        case 6 => "June"
        case 7 => "Jly"
        case 8 => "August"
        case 9 => "S"
        case 10 => "O"
        case 11 => "N"
        case 12 => "D"
      }

      val start = monthNameByNumber(startMonth)
      val end = monthNameByNumber(endMonth)
      override def toString = s"Rented house in MI for months of ${start} through ${end}."
    }

  class TreeHouse(
    val name:String, zip:String)
    extends House(zip)

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
    movie: String) extends Trip(origination, destination, startDate, endDate)
    
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