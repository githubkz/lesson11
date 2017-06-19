
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>"""),_display_(/*7.13*/title),format.raw/*7.18*/("""</title>
</head>
<body>
"""),_display_(/*10.2*/content),format.raw/*10.9*/("""
"""),format.raw/*11.1*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(messages)

  def f:((String) => (Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (messages) => apply(title)(content)(messages)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 05:41:13 PDT 2017
                  SOURCE: /Users/kasaikazunobu/scala/septeni/lesson11/app/views/main.scala.html
                  HASH: 171edb8be54e620dabe7d51b1489486f44b0c97b
                  MATRIX: 539->1|693->60|721->62|816->131|841->136|892->161|919->168|947->169
                  LINES: 20->1|25->1|27->3|31->7|31->7|34->10|34->10|35->11
                  -- GENERATED --
              */
          