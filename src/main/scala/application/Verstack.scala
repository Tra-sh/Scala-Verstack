package application

object X extends App {
}

class Coffee(val shots:Int = 2,
             val decaf:Int = 0,
             val milk:Boolean = false,
             val toGo:Boolean = false,
             val syrup:String = "") {
  var result = ""
  var caf = 0
  println(shots, decaf, milk, toGo, syrup)
  def getCup():Unit = {
    if(toGo) result += "ToGoCup "
    else result += "HereCup "
  }
  def pourShots():Unit = {
    caf = shots - decaf;
  }
  def addMilk():Unit = {
    if(milk) result += "milk "
  }
  def addSyrup():Unit = {
    result += syrup
  }
  getCup()
  pourShots()
  addMilk()
  addSyrup()
}