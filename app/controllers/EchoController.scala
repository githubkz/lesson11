package controllers

/**
  * Created by kasaikazunobu on 2017/06/19.
  */
import play.api.mvc._

class EchoController extends Controller {

  def echo = Action { request =>
    val message = request.queryString("message").head
    Ok(s"message = $message")
  }

}
