import sbt._

object Dependencies {
  val core = Seq(
    Library.slick,
    Library.slickHikariCP
  )

  val evolutions = Seq(
    Library.h2 % "test"
  )
}

object Version {

  val slick = "3.2.0"
  val h2 = "1.4.193"
}

object Library {
  val slick = "com.typesafe.slick" %% "slick" % Version.slick
  val slickHikariCP = "com.typesafe.slick" %% "slick-hikaricp" % Version.slick
  val h2 = "com.h2database" % "h2" % Version.h2
}