scalaVersion := "2.13.3"

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"
coverageEnabled := true 

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"

libraryDependencies += "org.scalameta" %% "munit" % "0.7.22" % Test
// Use %%% for non-JVM projects.
testFrameworks += new TestFramework("munit.Framework")