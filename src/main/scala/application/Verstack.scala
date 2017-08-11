package application

object XX extends App {

  trait WIFI {
    def address = "192.168.0.200"
    def reportStatus = "working"
  }

  class Camera {
    def showImage = "Showing video"
  }

  trait Connections {
    val maxConnections = 5
    private var current = 0

    def addConnection() = {
      current += 1
      true
    }

    def removeConnection() = {
      current -= 1
      true
    }

    def connect(adding: Boolean) = adding match {
      case true if (current < maxConnections) => addConnection
      case false if (current > 0) => removeConnection
      case _ => false
    }

    def connected = current
  }

  class WIFICamera extends Camera with WIFI

  trait ArtPeriod {
    val year: Int
    def show (year: Int) = year match {
      case x if x >= 1971 => "Contemporary"
      case x if x >= 1881 => "Modern"
      case x if x >= 1790 => "Romanticism"
      case x if x >= 1700 => "Late Baroque"
      case x if x >= 1600 => "Baroque"
      case x if x >= 1300  => "Renaissance"
      case _ => "Pre-Renaissance"
    }
    def show(): String = show(year)
  }

  class Painting (
      h: Int, 
      w: Int, 
      name: String, 
      someval: Int,
      val year: Int = 0) 
    extends ArtPeriod

}