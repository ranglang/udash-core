package io.udash.guide.views.frontend.demos

import io.udash._
import io.udash.guide.styles.BootstrapStyles
import io.udash.guide.styles.partials.GuideStyles
import org.scalajs.dom.Element

import scalatags.JsDom

class TextAreaDemoComponent extends Component {
  import io.udash.guide.Context._
  import JsDom.all._
  import scalacss.ScalatagsCss._

  val text: Property[String] = Property("")

  override def getTemplate: Element = div(id := "text-area-demo", GuideStyles.frame)(
    form(BootstrapStyles.containerFluid)(
      div(BootstrapStyles.row)(
        div(BootstrapStyles.colMd4)(
          TextArea(text, BootstrapStyles.formControl)
        ),
        div(BootstrapStyles.colMd4)(
          TextArea(text, BootstrapStyles.formControl)
        ),
        div(BootstrapStyles.colMd4)(
          TextArea(text, BootstrapStyles.formControl)
        )
      )
    )
  ).render
}
