name := "otkm"

organization := "example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "1.2.0",
    "org.apache.spark" %% "spark-streaming" % "1.2.0",
    "org.apache.spark" %% "spark-streaming-twitter" % "1.2.0",
    "org.atilika.kuromoji" % "kuromoji" % "0.7.7",
    "org.postgresql" % "postgresql" % "9.3-1102-jdbc41",
    "org.apache.commons" % "commons-dbcp2" % "2.0.1"
)

initialCommands := "import main._"
