name := "akka-assignment-1"

version := "0.1"

scalaVersion := "2.13.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"
// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.3"
// https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.3" % Test
