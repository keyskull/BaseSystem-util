lazy val commonSettings = Seq(
  organization := "me.keyskull",
  scalaVersion := "2.11.8",
  version := "1.0-Beta",
  javacOptions ++= Seq("-encoding", "UTF-8"),
  assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false, includeDependency = false),
  bintrayOrganization := Some("somethingworng"),
  bintrayReleaseOnPublish in ThisBuild := true,
  licenses += ("Apache-2.0", url("https://choosealicense.com/licenses/apache-2.0/")),
  bintrayOmitLicense in ThisBuild := false
)

lazy val util = (project in file(".")).settings(commonSettings: _*).
  settings(libraryDependencies ++= Seq(
//    "com.typesafe.play" %% "play-json" % "2.5.12",
//    "org.json" % "json" % "20160810",
//    "org.slf4j" % "slf4j-nop" % "1.7.20",
//    "com.typesafe.akka" %% "akka-testkit" % "2.4.8",
//    "com.typesafe.akka" %% "akka-slf4j" % "2.4.8",
    //    "org.scalacheck" %% "scalacheck" % "1.13.2" % "test" ,
    "org.scalatest" %% "scalatest" % "3.0.0" % "test"
  ))
