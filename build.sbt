enablePlugins(ScalaJSPlugin)

resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.jcenterRepo

scalaVersion := "2.12.4"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

libraryDependencies ++= Seq(
  "io.monadless" %% "monadless-core_sjs0.6" % "latest.version",
    "io.monadless" %% "monadless-stdlib_sjs0.6" % "latest.version"
)

scalacOptions ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-language:_",
    "-unchecked",

    "-Yno-adapted-args",
    "-Ywarn-numeric-widen",
    "-Xfuture",
    "-Ypartial-unification",
  )
