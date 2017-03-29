package application

class Sum(args:Int*) {
  def manOf[T: Manifest](t: T): Manifest[T] = manifest[T]
  def multipleArgumentsIterable(): Seq[Int] = {
    manOf(args) // scala.collection.Seq[Int]
    args // WrappedArray(1, 2, 3, 4)
  }
}

object Verstack extends App {
  println(new Sum(1,2,3,4).multipleArgumentsIterable())
}
