package application

object XX extends App {

  abstract class Animal {
    val food: String
    def templateMethod = s"The $animal goes $sound"
    def animal: String
    def sound: String
  }

  class Duck extends Animal {
    val food = "plants"
    def animal = "Duck"
    override def sound = "Quack"
  }

  class Cow extends Animal {
    val food = "grass"
    def animal = "Cow"
    def sound = "Moo"
  }

  class Chicken extends Animal {
    val food = "insects"
    def animal = "??"
    def sound = "??"
  }

  class Pig extends Animal {
    val food = "anything"
    def animal = "??"
    def sound = "??"
  }

  abstract class Adder(x:Int) {
    def add(i: Int): Int
  }

  class NumericAdder(val x:Int) extends Adder(x) {
    def add(y:Int):Int = x + y
  }

  class Ant extends Animal {
    val food = "???"
    def animal = "???"
    def sound = "???"
    def animal(x: Int) = x+x
  }
}