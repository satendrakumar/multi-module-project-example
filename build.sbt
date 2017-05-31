name := "multi-module-project"

version := "1.0"

scalaVersion := "2.11.8"



lazy val core = Project("core", file("core"))


lazy val restService = Project("rest-service", file("rest-service"))
  .dependsOn(core)

lazy val dataServices = Project("data-service", file("data-service"))
  .dependsOn(core)




