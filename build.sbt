name := "TypicallyGrade"

version := "1.0"

lazy val `typicallygrade` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
    jdbc
    ,cache
    , ws
    , specs2 % Test
    , "com.typesafe.play" %% "play-slick" % "2.0.0"
    , "com.typesafe.play" %% "play-slick-evolutions" % "2.0.0"
    , "org.postgresql" % "postgresql" % "9.4-1201-jdbc41"
)

unmanagedResourceDirectories in Test <+= baseDirectory(_ / "target/web/public/test")

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  