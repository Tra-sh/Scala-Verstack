package application

import org.scalatest._
import application._
import application.XX._

class ThisApp extends FlatSpec with Matchers {
  
  it should "Enumerations MonthName" in {
    MonthName.February.toString shouldEqual "February"
    MonthName.February.id shouldEqual 2
    MonthName.December.id shouldEqual 12
    MonthName.July.id shouldEqual 7

    import MonthName._
    July.toString shouldEqual "July"
    monthNumber(July) shouldEqual 7
  }

  it should "Enumerations seasons" in {
    import MonthName._
    season(January) shouldEqual "Winter"
    season(April) shouldEqual "Spring"
    season(August) shouldEqual "Summer"
    season(November) shouldEqual "Autumn"
  }

  it should "Enumerations grid" in {
    val grid = new Grid
    import application.XX.Entry._
    grid.play(X, 1, 1) shouldEqual "successful move"
    grid.play(X, 1, 1) shouldEqual "invalid move"
    grid.play(O, 1, 3) shouldEqual "invalid move"
  } 

  it should "Enumerations Levels" in {
    Level.Draining shouldEqual Draining
    Level.Draining.id shouldEqual 5
    checkLevel(Low) shouldEqual "Level Low OK"
    checkLevel(Empty) shouldEqual "Alert"
    checkLevel(Draining) shouldEqual "Level Draining OK"
    checkLevel(Pooling) shouldEqual "Warning!"
    checkLevel(Dry) shouldEqual "Alert"
  }
}