package application

import org.scalatest._
import application._
import application.X._

class ThisApp extends FlatSpec with Matchers {
  it should "get and set fields" in {
    val c = new Dimension(5,7)
    c.height shouldEqual 5
    c.height = 10
    c.height shouldEqual 10
    c.width = 19
    c.width shouldEqual 19
  }
  it should "info class" in {
    val info = new Info("stuff", "Something")
    info.name shouldEqual "stuff"
    info.description shouldEqual "Something"
    info.description = "Something else"
    info.description shouldEqual "Something else"
    info.name = "This shouldEqual the new name"
    info.name shouldEqual "This shouldEqual the new name"
  }
  it should "time, dude" in {
    val t1 = new SimpleTime(10, 30)
    val t2 = new SimpleTime(9, 30)
    val st = t1.subtract(t2)
    st.hours shouldEqual 1
    st.minutes shouldEqual 0
    val st2 = new SimpleTime(10, 30).subtract(new SimpleTime(9, 45))
    st2.hours shouldEqual 0
    st2.minutes shouldEqual 45
    val st3 = new SimpleTime(9, 30).subtract(new SimpleTime(10, 0))
    st3.hours shouldEqual 0
    st3.minutes shouldEqual 0
  }
  it should "have more simple time" in {
    val anotherT1 = new SimpleTimeDefault(10, 30)
    val anotherT2 = new SimpleTimeDefault(9)
    val anotherST = anotherT1.subtract(anotherT2)
    anotherST.hours shouldEqual 1
    anotherST.minutes shouldEqual 30
    val anotherST2 = new SimpleTimeDefault(10).
    subtract(new SimpleTimeDefault(9, 45))
    anotherST2.hours shouldEqual 0
    anotherST2.minutes shouldEqual 15
  }

  it should "use aux constructor" in {
    val auxT1 = new SimpleTimeAux(10, 5)
    val auxT2 = new SimpleTimeAux(6)
    val auxST = auxT1.subtract(auxT2)
    auxST.hours shouldEqual 4
    auxST.minutes shouldEqual 5
    val auxST2= new SimpleTimeAux(12).subtract(new SimpleTimeAux(9, 45))
    auxST2.hours shouldEqual 2
    auxST2.minutes shouldEqual 15
    val extraTask = new SimpleTimeAux
    extraTask.hours shouldEqual 0
    extraTask.minutes shouldEqual 0
  }
  
}


