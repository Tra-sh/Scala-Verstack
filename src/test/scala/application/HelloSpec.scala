package application

import org.scalatest._

class VerstackSpec extends FlatSpec with Matchers {
  "The Verstack object" should "say hello" in {
    Verstack.greeting shouldEqual "hello"
  }
}
