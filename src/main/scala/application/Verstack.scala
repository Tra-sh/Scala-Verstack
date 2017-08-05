package application

object X extends App {
  
    def weather(temperature: Int, humidity: Int) = {
      val t = temperature match {
        case n if n > 80 => "Hot"
        case n if n < 50 => "Cold"
        case _ => "Temperate"
      }
      val h = humidity match {
        case n if (n > 40 && temperature >= 50) => "Humid"
        case n if (n > 40 && temperature < 50) => "Damp"
        case _ => "Pleasant"
      }
      (t, h)
    }
    

}