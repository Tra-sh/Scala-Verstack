package application

object XX extends App {

  trait Building
  trait Room
  trait Storage
  trait Sink
  trait Store[T]
  trait Cook[T]
  trait Clean[T]
  trait Utensil extends Store[Utensil]
    with Clean[Utensil] with Cook[Utensil]

  trait Kitchen extends Room {
    val utensils: Vector[Utensil]
    def serveFood: Boolean
    def prepFood: Boolean
  }

  trait House extends Building {
    val kitchens: Vector[Kitchen]
  }

  class ServingKitchen extends Kitchen {
    val utensils = Vector(new ServeUtensils)
    val serveFood = true
    val prepFood = false
  }

  class PrepKitchen extends Kitchen {
    val utensils = Vector(new PrepUtensils)
    val serveFood = false
    val prepFood = true
  }

  class SimpleKitchen extends Kitchen {
    val utensils = Vector(new ServeUtensils, new PrepUtensils)
    val serveFood = true
    val prepFood = true
  }

  class ServeUtensils extends Utensil {
    override val toString = "ServeUtensils"
  }
  class PrepUtensils extends Utensil {
    override val toString = "PrepUtensils"
  }

}