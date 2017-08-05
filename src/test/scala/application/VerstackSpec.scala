package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {

  it should "WalkActivity" in {
    WalkActivity.start shouldEqual "started!"
    WalkActivity.start("Sally")
    WalkActivity.stop("Sally")
    WalkActivity.printActivity

    val suzie = new WalkActivity
    suzie.calories(150, 30) shouldEqual 117

    val john = new WalkActivity
    john.calories(150, 30, 1.5) shouldEqual 82
  }



}