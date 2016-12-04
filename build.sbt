name := "util"

organization := "me.keyskull"
scalaVersion := "2.11.8"



libraryDependencies ++= Seq(
  "org.json" % "json" % "20160810",
  "org.slf4j" % "slf4j-nop" % "1.7.20",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.8",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.8"
)

