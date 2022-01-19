lazy val root = (project in file("."))
  .settings(
    name := "EEG",
    Compile / mainClass := Some("application.Main"),
    assembly / mainClass := Some("application.Main"),
    assembly / assemblyJarName := "topPlayers.jar"
  )
  .aggregate(domain, infrastructure, application)

lazy val domain = project
lazy val infrastructure = project
lazy val application = project.dependsOn(domain, infrastructure)
