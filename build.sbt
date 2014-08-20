name := "linx"

organization := "com.jteigen"

scalaVersion := "2.11.2"

description := "A simple and typesafe link representation"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies ++= Seq(
    "com.novocode" % "junit-interface" % "0.10-M2" % "test",
    "junit" % "junit" % "4.11" % "test")

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

homepage := Some(url("http://github.com/teigen/linx"))
