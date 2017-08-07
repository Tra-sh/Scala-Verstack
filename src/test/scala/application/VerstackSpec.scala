package application

import org.scalatest._
import application._
import application.XX._

class ThisApp extends FlatSpec with Matchers {
  
  it should "Enumerations levels" in {
    import application.XX.Level._
    Level.Draining shouldEqual Draining
    Level.Draining.id shouldEqual 5
    checkLevel(Low) shouldEqual "Level Low OK"
    checkLevel(Empty) shouldEqual "Alert"
    checkLevel(Draining) shouldEqual "Level Draining OK"
    checkLevel(Pooling) shouldEqual "Warning!"
    checkLevel(Dry) shouldEqual "Alert"
  }
}