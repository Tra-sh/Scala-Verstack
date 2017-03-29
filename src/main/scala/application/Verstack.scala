package application

object X extends App {
}

class Tea(
  val decaf: Boolean = false,
  val milk: Boolean = false,
  val sugar: Boolean = false,
  val name: String = "Earl Grey") {
  
  def describe():String = {
    var description = name
    if (decaf) description += " decaf"
    if (milk) description += " + milk"
    if (sugar) description += " + sugar"
    description
  }
  def calories():Int = {
    var count = 0
    if (milk) count += 100
    if (sugar) count += 16
    count
  }
}
