
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kasaikazunobu/scala/septeni/lesson11/conf/routes
// @DATE:Mon Jun 19 05:43:32 PDT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}