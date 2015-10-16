name := "scala-sugar"
com.typesafe.sbt.SbtGit.versionWithGit

organization := "com.swoop"

bintrayOrganization := Some("swoop-inc")
bintrayPackageLabels := Seq("scala", "swoop", "util", "utilities")

licenses +=("MIT", url("http://opensource.org/licenses/MIT"))

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

scalaVersion := "2.10.4"

crossScalaVersions := Seq("2.10.4", "2.10.5", "2.11.4")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

scalacOptions in(Compile, doc) ++= Seq("-groups", "-implicits")
javacOptions in(Compile, doc) ++= Seq("-notimestamp", "-linksource")
autoAPIMappings := true

testOptions in Test += Tests.Argument("-oS")

// For ghpages-push-site
site.settings
ghpages.settings
git.remoteRepo := "git@github.com:swoop-inc/scala-sugar.git"
site.includeScaladoc()
