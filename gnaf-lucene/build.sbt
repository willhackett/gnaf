name := "gnaf-lucene"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.3.0",
  "com.jsuereth" %% "scala-arm" % "2.0.0-M1",
  "au.csiro.data61.gnaf" %% "gnaf-util" % "0.1-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
  )

libraryDependencies ++= Seq(
  "lucene-core",
  "lucene-analyzers-common"
) map ("org.apache.lucene" % _ % "6.2.0")
