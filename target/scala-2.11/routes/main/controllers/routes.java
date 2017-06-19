
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kasaikazunobu/scala/septeni/lesson11/conf/routes
// @DATE:Mon Jun 19 05:43:32 PDT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseEchoController EchoController = new controllers.ReverseEchoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseEchoController EchoController = new controllers.javascript.ReverseEchoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
