package io.udash.guide.views

import io.udash._
import io.udash.guide.RootState
import io.udash.guide.styles.partials.GuideStyles
import org.scalajs.dom.Element

object FAQViewPresenter extends DefaultViewPresenterFactory[RootState.type](() => new FAQView)

class FAQView extends View {
  import scalacss.ScalatagsCss._
  import scalatags.JsDom.all._

  private val content = div(
    h2("FAQ"),
    p("TODO")
  ).render

  override def getTemplate: Element = content

  override def renderChild(view: View): Unit = {}
}