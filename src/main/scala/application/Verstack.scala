package application

object X extends App {
  
  class GreatApe {
    val weight = 100.0
    val age = 12

    def vocalize = "Grrr!"
  }

  class Bonobo extends GreatApe
  class Chimpanzee extends GreatApe
  class BonoboB extends Bonobo

  def says(monk: GreatApe) = s"says ${monk.vocalize}"

  class Cycle {
    val wheels = 2
    def ride = "Riding"
  }

  class Bicycle extends Cycle
    
}