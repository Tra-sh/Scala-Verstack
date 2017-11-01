package application

object XX extends App {

  def and(x: Boolean, y: Boolean) = {
    if (x) {
      if (y) true else false
    } else {
      false
    }
  }

  def or(x: Boolean, y: Boolean) = {
    if (x) {
      true
    } else {
      if (y) true else false
    }
  }

}