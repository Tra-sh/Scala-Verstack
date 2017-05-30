package application

object X extends App {
  import java.io._ 
  val file = "4.html"
  val campagnCode = "1"

  def makeHTML(list: List[(String, String)]) = {
    val header = "<html><body><ol>"
    val footer = "</ol></body></html>"
    val items = list.map(s => s"""<li><a href="https://m.vk.com/${s._1}?${campagnCode}" target="_blank">${s._2}</a></li>""")
    ((header :: items) :+ footer).mkString
  }

  def collectIds(string: String) = {
    val vkontakteId = """<a class="si_owner[^>]*href="/([^"]+)">([^<]+)</a>""".r
    for {
      vkontakteId(id,name) <- (vkontakteId findAllIn string)
    } yield (id,name)
  }

  def read(filename: String) = {
    import java.nio.charset.CodingErrorAction
    import scala.io.Codec
    implicit val codec = Codec("UTF-8")
    codec.onMalformedInput(CodingErrorAction.REPLACE)
    codec.onUnmappableCharacter(CodingErrorAction.REPLACE)
    try {
      Some(io.Source.fromFile(filename).getLines.mkString)
    } catch {
      case ex: FileNotFoundException => {println(s"Couldn't FIND '${filename}'"); None}
      case ex: IOException => {println(s"Couldn't READ '${filename}'"); None}
    }
  }

  def write(content: String, filename: String) = {
    import java.nio.file.{Paths, Files}
    import java.nio.charset.StandardCharsets
    Files.write(Paths.get(filename), content.getBytes(StandardCharsets.UTF_8))
    println(s"Done writing ${filename}!")
  }

  read(file) match {
    case Some(s) => write(makeHTML(collectIds(s).toList), s"updated_${file}")
    case _ => ()
  }

}
