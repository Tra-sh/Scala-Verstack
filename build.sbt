import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.12.4",
      version      := "0.1.1"
    )),
    name := "Verstack",
    libraryDependencies += scalaTest % Test
  )

fork := true
cancelable := true
