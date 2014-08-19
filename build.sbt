import aether.Aether._

releaseSettings

aetherPublishBothSettings

name := "linx"

organization := "com.jteigen"

scalaVersion := "2.11.4"

description := "A simple and typesafe link representation"

crossScalaVersions := Seq("2.10.4", "2.11.4")

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

libraryDependencies ++= Seq(
    "com.novocode" % "junit-interface" % "0.10-M2" % "test",
    "junit" % "junit" % "4.11" % "test")

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

publishMavenStyle := true

publishTo <<= version { v =>
  val proxy = "http://mavenproxy.finntech.no/finntech-internal-"
  val end = if(v endsWith "SNAPSHOT") "snapshot" else "release"
  Some("Finn-" + end at proxy + end)
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

homepage := Some(url("http://github.com/teigen/linx"))

pomExtra := (
  <scm>
    <url>git@github.com:teigen/linx.git</url>
    <connection>scm:git:git@github.com:teigen/linx.git</connection>
  </scm>
  <developers>
    <developer>
      <id>jteigen</id>
      <name>Jon-Anders Teigen</name>
      <url>http://jteigen.com</url>
    </developer>
  </developers>)
