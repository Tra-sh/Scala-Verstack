package application
// shouldEqual

import org.scalatest._
import application._
import application.XX._

class ThisApp extends FlatSpec with Matchers {
  it should "Composition" in {

    val serving = new ServingKitchen
    serving.serveFood shouldEqual true
    serving.prepFood shouldEqual false
    serving.utensils.toString shouldEqual "Vector(ServeUtensils)"

    val prep = new PrepKitchen
    prep.prepFood shouldEqual true
    prep.serveFood shouldEqual false
    prep.utensils.toString shouldEqual "Vector(PrepUtensils)"

    val simple = new SimpleKitchen
    simple.serveFood shouldEqual true
    simple.prepFood shouldEqual true
    simple.utensils.toString shouldEqual "Vector(ServeUtensils, PrepUtensils)"
  }
}