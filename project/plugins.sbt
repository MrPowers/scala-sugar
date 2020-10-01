resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
  url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
    Resolver.ivyStylePatterns)

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.6")
/*addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")*/

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")
