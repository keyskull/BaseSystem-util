lazy val commonSettings = Seq(
  organization := "me.keyskull",
  scalaVersion := "2.11.8"
)

lazy val util = (project in file(".")).settings(commonSettings: _*).
  settings(libraryDependencies ++=
    "org.json" % "json" % "20160810" ::
      "org.slf4j" % "slf4j-nop" % "1.7.20" ::
      "com.typesafe.akka" %% "akka-testkit" % "2.4.8" ::
      "com.typesafe.akka" %% "akka-slf4j" % "2.4.8" ::
      Nil)
