package application

object X extends App {
  def  f(): Int = 0
  def  f(a:Int): Int = a
  def  f(a:Int, b:Int): Int = a + b
  def  f(a:Int, b:Int, c:Int): Int = a + b + c
  def  f(a:Int, b:Int, c:Int, d:Int): Int = a + b + c + d
}

class Overloading1 {
  def f():Int = { 88 }
  def f(n:Int):Int = { n + 2 }
}

class Overloading2 {
  def f():Int = { 99 }
  def f(n:Int):Int = { n + 3 }
}
