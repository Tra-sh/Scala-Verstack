package application

object X extends App {
}

class ClothesWasher(val modelName: String, val capacity: Double) {
  def this (modelName: String) {
    this(modelName, 2.0)
  }
  def this (capacity: Double) {
    this("Samsung", capacity)
  }
  def wash(bleach: Int, softener: Int) = s"Wash used ${bleach} bleach and ${softener} fabric softener"
  def wash() = "Simple wash"
}