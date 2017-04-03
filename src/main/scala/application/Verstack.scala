package application

object X extends App {
  def explicitDouble(d1:Double, d2:Double, d3:Double):Vector[Double] = Vector(d1, d2, d3)

  def explicitList(src:Vector[Double]):List[Double] = src.toList;

  def explicitSet(src:Vector[Double]):Set[Double] = src.toSet;

  def forecast(percentage: Int):String = percentage match {
     case 100 => "Sunny"
     case 80 => "Mostly Sunny"
     case 50 => "Partly Sunny"
     case 20 => "Mostly Cloudy"
      case 0 => "Cloudy"
      case _ => "Unknown"
  }

  def historicalData(a:Vector[Int]):String = {
    a.groupBy(a => a).mapValues(_.size)
    .toList.sortBy(- _._1)
    .map { case (weatherType, count) => s"${forecast(weatherType)}=$count"}
    .mkString(", ")
    .toString
  }

}


