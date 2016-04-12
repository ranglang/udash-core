package io.udash.guide.styles.constant

/**
  * Created by malchik on 2016-03-22.
  */

import scalacss.Defaults._

object StyleConstants extends StyleSheet.Inline{
  import dsl._

  /**
    * SIZES
    */
  object Sizes {
    val BodyWidth = 1075

    val HeaderHeight = 80

    val HeaderHeightMobile = 80

    val FooterHeight = 120

    val MenuWidth = 320

    val MobileMenuButton = 50
  }

  /**
    * COLORS
    */
  object Colors {
    val Red = c"#e30613"

    val RedLight = c"#ff2727"

    val GreyExtra = c"#ebebeb"

    val GreySemi = c"#cfcfd6"

    val Grey = c"#777785"

    val Yellow = c"#ffd600"

    val Cyan = c"#eef4f7"
  }

  /**
    * MEDIA QUERIES
    */
  object MediaQueriesBounds {
    val TabletLandscapeMax = Sizes.BodyWidth - 1

    val TabletLandscapeMin = 768

    val TabletMax = TabletLandscapeMin - 1

    val TableMin = 481

    val PhoneMax = TableMin - 1
  }
}
