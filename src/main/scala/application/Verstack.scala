package application

object Verstack extends Greeting with App {
}

trait Greeting {
  lazy val greeting: String = "hello"
}
