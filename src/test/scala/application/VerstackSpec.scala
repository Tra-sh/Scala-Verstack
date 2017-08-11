package application
// shouldEqual

import org.scalatest._
import application._
import application.XX._

class ThisApp extends FlatSpec with Matchers {

  it should "WIFICamera" in {
    val webcam = new WIFICamera
    webcam.showImage shouldEqual "Showing video"
    webcam.address shouldEqual "192.168.0.200"
    webcam.reportStatus shouldEqual "working"
  }

  it should "Connections" in {
    val c = new Object with Connections

    c.maxConnections shouldEqual 5
    c.connect(true) shouldEqual true
    c.connected shouldEqual 1

    for(i <- 0 to 3) c.connect(true) shouldEqual true
    c.connect(true) shouldEqual false
    c.connect(false) shouldEqual true
    c.connected shouldEqual 4

    for(i <- 0 to 3) c.connect(false) shouldEqual true
    c.connected shouldEqual 0
    c.connect(false) shouldEqual false
  }
  
  it should "WIFICamera 2" in {
    val c2 = new WIFICamera with Connections
    c2.maxConnections shouldEqual 5
    c2.connect(true) shouldEqual true
    c2.connected shouldEqual 1
    c2.connect(false) shouldEqual true
    c2.connected shouldEqual 0
    c2.connect(false) shouldEqual false
  }

  it should "art" in {
    val period = new ArtPeriod {
      val year = 0
    }
    period.show(1400) shouldEqual "Renaissance"
    period.show(1650) shouldEqual "Baroque"
    period.show(1279) shouldEqual "Pre-Renaissance"

    val painting = new Painting(64, 80, "Starry", 111)
    painting.show(1889) shouldEqual "Modern"

    val painting2 = new Painting(64, 80, "Starry", 111, 1889) 
    painting2.show shouldEqual "Modern"
  }
}