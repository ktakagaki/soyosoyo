ThisBuild / organization := "com.github.ktakagaki"
ThisBuild / organizationName := "ktakagaki"
ThisBuild / organizationHomepage := Some(url("https://github.com/ktakagaki"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/ktakagaki/soyosoyo"),
    "scm:git@github.com:ktakagak/soyosoyo.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "ktakagaki",
    name  = "ktakagaki",
    email = "xxxxx@gmail.com",
    url   = url("https://github.com/ktakagaki")
  )
)

ThisBuild / description := "Some description about your project."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/ktakagaki/soyosoyo"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true