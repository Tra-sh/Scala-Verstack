package application

object XX extends App {
  class EnergySource
  trait BatteryPower {
    def monitor(charge: Int) = charge match {
      case n if n >= 40 => "green"
      case n if n >= 20 => "yellow"
      case _ => "red"
    }
  }
  
  class Battery extends EnergySource with BatteryPower

  class Toy
  class BatteryPoweredToy extends Toy with BatteryPower {
    
  }

}