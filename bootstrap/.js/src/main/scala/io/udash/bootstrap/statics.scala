package io.udash.bootstrap

import io.udash.css.CssStyleName

object BootstrapTags {
  import scalatags.JsDom.all._

  val dataBackdrop = attr("data-backdrop")
  val dataBind = attr("data-bind")
  val dataDismiss = attr("data-dismiss")
  val dataKeyboard = attr("data-keyboard")
  val dataLabel = attr("data-label")
  val dataParent = attr("data-parent")
  val dataRide = attr("data-ride")
  val dataShow = attr("data-show")
  val dataSlide = attr("data-slide")
  val dataSlideTo = attr("data-slide-to")
  val dataTarget = attr("data-target")
  val dataToggle = attr("data-toggle")

}

object BootstrapStyles {
  def active = CssStyleName("active")
  def container = CssStyleName("container")
  def containerFluid = CssStyleName("container-fluid")
  def row = CssStyleName("row")
  def pullLeft = CssStyleName("pull-left")
  def pullRight = CssStyleName("pull-right")
  def centerBlock = CssStyleName("center-block")
  def affix = CssStyleName("affix")
  def arrow = CssStyleName("arrow")
  def bottom = CssStyleName("bottom")
  def close = CssStyleName("close")
  def col = CssStyleName("col")
  def collapsed = CssStyleName("collapsed")
  def body = container
  def divider = CssStyleName("divider")
  def disabled = CssStyleName("disabled")
  def fade = CssStyleName("fade")
  def hide = CssStyleName("hide")
  def iconBar = CssStyleName("icon-bar")
  def iconNext = CssStyleName("icon-next")
  def in = CssStyleName("in")
  def item = CssStyleName("item")
  def jumbotron = CssStyleName("jumbotron")
  def left = CssStyleName("left")
  def next = CssStyleName("next")
  def pillPane = CssStyleName("pill-pane")
  def preScrollable = CssStyleName("pre-scrollable")
  def prettyprint = CssStyleName("prettyprint")
  def previous = CssStyleName("previous")
  def prev = CssStyleName("prev")
  def right = CssStyleName("right")
  def show = CssStyleName("show")
  def top = CssStyleName("top")

  object Collapse {
    def collapse = CssStyleName("collapse")
    def collapsing = CssStyleName("collapsing")
    def collapseIn = in
  }

  object Grid {
    def colLg1 = CssStyleName("col-lg-1")
    def colLg10 = CssStyleName("col-lg-10")
    def colLg11 = CssStyleName("col-lg-11")
    def colLg12 = CssStyleName("col-lg-12")
    def colLg2 = CssStyleName("col-lg-2")
    def colLg3 = CssStyleName("col-lg-3")
    def colLg4 = CssStyleName("col-lg-4")
    def colLg5 = CssStyleName("col-lg-5")
    def colLg6 = CssStyleName("col-lg-6")
    def colLg7 = CssStyleName("col-lg-7")
    def colLg8 = CssStyleName("col-lg-8")
    def colLg9 = CssStyleName("col-lg-9")
    def colLgOffset0 = CssStyleName("col-lg-offset-0")
    def colLgOffset1 = CssStyleName("col-lg-offset-1")
    def colLgOffset10 = CssStyleName("col-lg-offset-10")
    def colLgOffset11 = CssStyleName("col-lg-offset-11")
    def colLgOffset2 = CssStyleName("col-lg-offset-2")
    def colLgOffset3 = CssStyleName("col-lg-offset-3")
    def colLgOffset4 = CssStyleName("col-lg-offset-4")
    def colLgOffset5 = CssStyleName("col-lg-offset-5")
    def colLgOffset6 = CssStyleName("col-lg-offset-6")
    def colLgOffset7 = CssStyleName("col-lg-offset-7")
    def colLgOffset8 = CssStyleName("col-lg-offset-8")
    def colLgOffset9 = CssStyleName("col-lg-offset-9")
    def colLgPull0 = CssStyleName("col-lg-pull-0")
    def colLgPull1 = CssStyleName("col-lg-pull-1")
    def colLgPull10 = CssStyleName("col-lg-pull-10")
    def colLgPull11 = CssStyleName("col-lg-pull-11")
    def colLgPull2 = CssStyleName("col-lg-pull-2")
    def colLgPull3 = CssStyleName("col-lg-pull-3")
    def colLgPull4 = CssStyleName("col-lg-pull-4")
    def colLgPull5 = CssStyleName("col-lg-pull-5")
    def colLgPull6 = CssStyleName("col-lg-pull-6")
    def colLgPull7 = CssStyleName("col-lg-pull-7")
    def colLgPull8 = CssStyleName("col-lg-pull-8")
    def colLgPull9 = CssStyleName("col-lg-pull-9")
    def colLgPush0 = CssStyleName("col-lg-push-0")
    def colLgPush1 = CssStyleName("col-lg-push-1")
    def colLgPush10 = CssStyleName("col-lg-push-10")
    def colLgPush11 = CssStyleName("col-lg-push-11")
    def colLgPush2 = CssStyleName("col-lg-push-2")
    def colLgPush3 = CssStyleName("col-lg-push-3")
    def colLgPush4 = CssStyleName("col-lg-push-4")
    def colLgPush5 = CssStyleName("col-lg-push-5")
    def colLgPush6 = CssStyleName("col-lg-push-6")
    def colLgPush7 = CssStyleName("col-lg-push-7")
    def colLgPush8 = CssStyleName("col-lg-push-8")
    def colLgPush9 = CssStyleName("col-lg-push-9")
    def colMd1 = CssStyleName("col-md-1")
    def colMd10 = CssStyleName("col-md-10")
    def colMd11 = CssStyleName("col-md-11")
    def colMd12 = CssStyleName("col-md-12")
    def colMd2 = CssStyleName("col-md-2")
    def colMd3 = CssStyleName("col-md-3")
    def colMd4 = CssStyleName("col-md-4")
    def colMd5 = CssStyleName("col-md-5")
    def colMd6 = CssStyleName("col-md-6")
    def colMd7 = CssStyleName("col-md-7")
    def colMd8 = CssStyleName("col-md-8")
    def colMd9 = CssStyleName("col-md-9")
    def colMdOffset0 = CssStyleName("col-md-offset-0")
    def colMdOffset1 = CssStyleName("col-md-offset-1")
    def colMdOffset10 = CssStyleName("col-md-offset-10")
    def colMdOffset11 = CssStyleName("col-md-offset-11")
    def colMdOffset2 = CssStyleName("col-md-offset-2")
    def colMdOffset3 = CssStyleName("col-md-offset-3")
    def colMdOffset4 = CssStyleName("col-md-offset-4")
    def colMdOffset5 = CssStyleName("col-md-offset-5")
    def colMdOffset6 = CssStyleName("col-md-offset-6")
    def colMdOffset7 = CssStyleName("col-md-offset-7")
    def colMdOffset8 = CssStyleName("col-md-offset-8")
    def colMdOffset9 = CssStyleName("col-md-offset-9")
    def colMdPull0 = CssStyleName("col-md-pull-0")
    def colMdPull1 = CssStyleName("col-md-pull-1")
    def colMdPull10 = CssStyleName("col-md-pull-10")
    def colMdPull11 = CssStyleName("col-md-pull-11")
    def colMdPull2 = CssStyleName("col-md-pull-2")
    def colMdPull3 = CssStyleName("col-md-pull-3")
    def colMdPull4 = CssStyleName("col-md-pull-4")
    def colMdPull5 = CssStyleName("col-md-pull-5")
    def colMdPull6 = CssStyleName("col-md-pull-6")
    def colMdPull7 = CssStyleName("col-md-pull-7")
    def colMdPull8 = CssStyleName("col-md-pull-8")
    def colMdPull9 = CssStyleName("col-md-pull-9")
    def colMdPush0 = CssStyleName("col-md-push-0")
    def colMdPush1 = CssStyleName("col-md-push-1")
    def colMdPush10 = CssStyleName("col-md-push-10")
    def colMdPush11 = CssStyleName("col-md-push-11")
    def colMdPush2 = CssStyleName("col-md-push-2")
    def colMdPush3 = CssStyleName("col-md-push-3")
    def colMdPush4 = CssStyleName("col-md-push-4")
    def colMdPush5 = CssStyleName("col-md-push-5")
    def colMdPush6 = CssStyleName("col-md-push-6")
    def colMdPush7 = CssStyleName("col-md-push-7")
    def colMdPush8 = CssStyleName("col-md-push-8")
    def colMdPush9 = CssStyleName("col-md-push-9")
    def colSm1 = CssStyleName("col-sm-1")
    def colSm10 = CssStyleName("col-sm-10")
    def colSm11 = CssStyleName("col-sm-11")
    def colSm12 = CssStyleName("col-sm-12")
    def colSm2 = CssStyleName("col-sm-2")
    def colSm3 = CssStyleName("col-sm-3")
    def colSm4 = CssStyleName("col-sm-4")
    def colSm5 = CssStyleName("col-sm-5")
    def colSm6 = CssStyleName("col-sm-6")
    def colSm7 = CssStyleName("col-sm-7")
    def colSm8 = CssStyleName("col-sm-8")
    def colSm9 = CssStyleName("col-sm-9")
    def colSmOffset1 = CssStyleName("col-sm-offset-1")
    def colSmOffset10 = CssStyleName("col-sm-offset-10")
    def colSmOffset11 = CssStyleName("col-sm-offset-11")
    def colSmOffset2 = CssStyleName("col-sm-offset-2")
    def colSmOffset3 = CssStyleName("col-sm-offset-3")
    def colSmOffset4 = CssStyleName("col-sm-offset-4")
    def colSmOffset5 = CssStyleName("col-sm-offset-5")
    def colSmOffset6 = CssStyleName("col-sm-offset-6")
    def colSmOffset7 = CssStyleName("col-sm-offset-7")
    def colSmOffset8 = CssStyleName("col-sm-offset-8")
    def colSmOffset9 = CssStyleName("col-sm-offset-9")
    def colSmPull1 = CssStyleName("col-sm-pull-1")
    def colSmPull10 = CssStyleName("col-sm-pull-10")
    def colSmPull11 = CssStyleName("col-sm-pull-11")
    def colSmPull2 = CssStyleName("col-sm-pull-2")
    def colSmPull3 = CssStyleName("col-sm-pull-3")
    def colSmPull4 = CssStyleName("col-sm-pull-4")
    def colSmPull5 = CssStyleName("col-sm-pull-5")
    def colSmPull6 = CssStyleName("col-sm-pull-6")
    def colSmPull7 = CssStyleName("col-sm-pull-7")
    def colSmPull8 = CssStyleName("col-sm-pull-8")
    def colSmPull9 = CssStyleName("col-sm-pull-9")
    def colSmPush1 = CssStyleName("col-sm-push-1")
    def colSmPush10 = CssStyleName("col-sm-push-10")
    def colSmPush11 = CssStyleName("col-sm-push-11")
    def colSmPush2 = CssStyleName("col-sm-push-2")
    def colSmPush3 = CssStyleName("col-sm-push-3")
    def colSmPush4 = CssStyleName("col-sm-push-4")
    def colSmPush5 = CssStyleName("col-sm-push-5")
    def colSmPush6 = CssStyleName("col-sm-push-6")
    def colSmPush7 = CssStyleName("col-sm-push-7")
    def colSmPush8 = CssStyleName("col-sm-push-8")
    def colSmPush9 = CssStyleName("col-sm-push-9")
    def colXs1 = CssStyleName("col-xs-1")
    def colXs10 = CssStyleName("col-xs-10")
    def colXs11 = CssStyleName("col-xs-11")
    def colXs12 = CssStyleName("col-xs-12")
    def colXs2 = CssStyleName("col-xs-2")
    def colXs3 = CssStyleName("col-xs-3")
    def colXs4 = CssStyleName("col-xs-4")
    def colXs5 = CssStyleName("col-xs-5")
    def colXs6 = CssStyleName("col-xs-6")
    def colXs7 = CssStyleName("col-xs-7")
    def colXs8 = CssStyleName("col-xs-8")
    def colXs9 = CssStyleName("col-xs-9")
  }

  object Background {
    def bgPrimary = CssStyleName("bg-primary")
    def bgSuccess = CssStyleName("bg-success")
    def bgInfo = CssStyleName("bg-info")
    def bgWarning = CssStyleName("bg-warning")
    def bgDanger = CssStyleName("bg-danger")
  }

  object Button {
    def btn = CssStyleName("btn")
    def btnBlock = CssStyleName("btn-block")
    def btnDanger = CssStyleName("btn-danger")
    def btnDefault = CssStyleName("btn-default")
    def btnGroup = CssStyleName("btn-group")
    def btnGroupJustified = CssStyleName("btn-group-justified")
    def btnGroupVertical = CssStyleName("btn-group-vertical")
    def btnInfo = CssStyleName("btn-info")
    def btnLg = CssStyleName("btn-lg")
    def btnLink = CssStyleName("btn-link")
    def btnPrimary = CssStyleName("btn-primary")
    def btnSuccess = CssStyleName("btn-success")
    def btnToolbar = CssStyleName("btn-toolbar")
    def btnWarning = CssStyleName("btn-warning")
    def btnXs = CssStyleName("btn-xs")
    def btnSm = CssStyleName("btn-sm")
  }

  object Well {
    def well = CssStyleName("well")
    def wellLg = CssStyleName("well-lg")
    def wellSm = CssStyleName("well-sm")
  }

  object Carousel {
    def carousel = CssStyleName("carousel")
    def carouselCaption = CssStyleName("carousel-caption")
    def carouselControl = CssStyleName("carousel-control")
    def carouselIndicators = CssStyleName("carousel-indicators")
    def carouselInner = CssStyleName("carousel-inner")
    def slide = CssStyleName("slide")
  }

  object Alert {
    def alert = CssStyleName("alert")
    def alertDanger = CssStyleName("alert-danger")
    def alertDismissible = CssStyleName("alert-dismissible")
    def alertInfo = CssStyleName("alert-info")
    def alertLink = CssStyleName("alert-link")
    def alertSuccess = CssStyleName("alert-success")
    def alertWarning = CssStyleName("alert-warning")
  }

  object Dropdown {
    def dropdown = CssStyleName("dropdown")
    def dropdownBackdrop = CssStyleName("dropdown-backdrop")
    def dropdownHeader = CssStyleName("dropdown-header")
    def dropdownMenu = CssStyleName("dropdown-menu")
    def dropdownToggle = CssStyleName("dropdown-toggle")
    def dropup = CssStyleName("dropup")
    def caret = CssStyleName("caret")
  }

  object Visibility {
    def clearfix = CssStyleName("clearfix")
    def hidden = CssStyleName("hidden")
    def hiddenLg = CssStyleName("hidden-lg")
    def hiddenMd = CssStyleName("hidden-md")
    def hiddenPrint = CssStyleName("hidden-print")
    def hiddenSm = CssStyleName("hidden-sm")
    def hiddenXs = CssStyleName("hidden-xs")
    def visibleLg = CssStyleName("visible-lg")
    def visibleMd = CssStyleName("visible-md")
    def visiblePrint = CssStyleName("visible-print")
    def visibleSm = CssStyleName("visible-sm")
    def visibleXs = CssStyleName("visible-xs")
    def invisible = CssStyleName("invisible")
    def srOnly = CssStyleName("sr-only")
    def srOnlyFocusable = CssStyleName("sr-only-focusable")
  }

  object Typography {
    def h1 = CssStyleName("h1")
    def h2 = CssStyleName("h2")
    def h3 = CssStyleName("h3")
    def h4 = CssStyleName("h4")
    def h5 = CssStyleName("h5")
    def h6 = CssStyleName("h6")
    def pageHeader = CssStyleName("page-header")
    def lead = CssStyleName("lead")
    def textCenter = CssStyleName("text-center")
    def textDanger = CssStyleName("text-danger")
    def textHide = CssStyleName("text-hide")
    def textInfo = CssStyleName("text-info")
    def textLeft = CssStyleName("text-left")
    def textMuted = CssStyleName("text-muted")
    def textPrimary = CssStyleName("text-primary")
    def textRight = CssStyleName("text-right")
    def textSuccess = CssStyleName("text-success")
    def textWarning = CssStyleName("text-warning")
    def textNoWrap = CssStyleName("text-nowrap")
    def textLowercase = CssStyleName("text-lowercase")
    def textUppercase = CssStyleName("text-uppercase")
    def textCapitalize = CssStyleName("text-capitalize")
    def initialism = CssStyleName("initialism")
  }

  object List {
    def listGroup = CssStyleName("list-group")
    def listGroupItem = CssStyleName("list-group-item")
    def listGroupItemHeading = CssStyleName("list-group-item-heading")
    def listGroupItemText = CssStyleName("list-group-item-text")
    def listInline = CssStyleName("list-inline")
    def listUnstyled = CssStyleName("list-unstyled")
    def listItemSuccess = CssStyleName("list-group-item-success")
    def listItemInfo = CssStyleName("list-group-item-info")
    def listItemWarning = CssStyleName("list-group-item-warning")
    def listItemDanger = CssStyleName("list-group-item-danger")
    def dlHorizontal = CssStyleName("dl-horizontal")
  }

  object Table {
    def table = CssStyleName("table")
    def tableBordered = CssStyleName("table-bordered")
    def tableResponsive = CssStyleName("table-responsive")
    def tableStriped = CssStyleName("table-striped")
    def tableHover = CssStyleName("table-hover")
    def tableCondensed = CssStyleName("table-condensed")
    def success = CssStyleName("success")
    def info = CssStyleName("info")
    def warning = CssStyleName("warning")
    def danger = CssStyleName("danger")
  }

  object Form {
    def formControl = CssStyleName("form-control")
    def formControlStatic = CssStyleName("form-control-static")
    def formGroup = CssStyleName("form-group")
    def formGroupLg = CssStyleName("form-group-lg")
    def formGroupSm = CssStyleName("form-group-sm")
    def formInline = CssStyleName("form-inline")
    def formHorizontal = CssStyleName("form-horizontal")
    def inputGroup = CssStyleName("input-group")
    def inputGroupAddon = CssStyleName("input-group-addon")
    def inputGroupBtn = CssStyleName("input-group-btn")
    def inputGroupLg = CssStyleName("input-group-lg")
    def inputGroupSm = CssStyleName("input-group-sm")
    def inputLg = CssStyleName("input-lg")
    def inputSm = CssStyleName("input-sm")
    def checkbox = CssStyleName("checkbox")
    def checkboxInline = CssStyleName("checkbox-inline")
    def hasWarning = CssStyleName("has-warning")
    def hasError = CssStyleName("has-error")
    def hasSuccess = CssStyleName("has-success")
    def hasFeedback = CssStyleName("has-feedback")
    def helpBlock = CssStyleName("help-block")
    def radio = CssStyleName("radio")
    def radioInline = CssStyleName("radio-inline")
    def controlLabel = CssStyleName("control-label")
  }

  object Image {
    def imgCircle = CssStyleName("img-circle")
    def imgResponsive = CssStyleName("img-responsive")
    def imgRounded = CssStyleName("img-rounded")
    def imgThumbnail = CssStyleName("img-thumbnail")
    def caption = CssStyleName("caption")
    def thumbnail = CssStyleName("thumbnail")

    @deprecated("Use `UdashIcons.FontAwesome` styles instead.", "0.6.0")
    def _fa = CssStyleName("fa")
    @deprecated("Use `UdashIcons.Glyphicon` styles instead.", "0.6.0")
    def _glyphicon = CssStyleName("glyphicon")

    @deprecated("Use `UdashIcons.FontAwesome` instead.", "0.6.0")
    def fa(name: String) = Seq(_fa, CssStyleName(s"fa-$name"))
    @deprecated("Use `UdashIcons.FontAwesome` instead.", "0.6.0")
    def glyphicon(name: String) = Seq(_glyphicon, CssStyleName(s"glyphicon-$name"))
  }

  object Navigation {
    def nav = CssStyleName("nav")
    def navbar = CssStyleName("navbar")
    def navbarBrand = CssStyleName("navbar-brand")
    def navbarBtn = CssStyleName("navbar-btn")
    def navbarCollapse = CssStyleName("navbar-collapse")
    def navbarDefault = CssStyleName("navbar-default")
    def navbarFixedBottom = CssStyleName("navbar-fixed-bottom")
    def navbarFixedTop = CssStyleName("navbar-fixed-top")
    def navbarForm = CssStyleName("navbar-form")
    def navbarHeader = CssStyleName("navbar-header")
    def navbarInverse = CssStyleName("navbar-inverse")
    def navbarLeft = CssStyleName("navbar-left")
    def navbarLink = CssStyleName("navbar-link")
    def navbarNav = CssStyleName("navbar-nav")
    def navbarRight = CssStyleName("navbar-right")
    def navbarStaticTop = CssStyleName("navbar-static-top")
    def navbarText = CssStyleName("navbar-text")
    def navbarToggle = CssStyleName("navbar-toggle")
    def navDivider = CssStyleName("nav-divider")
    def navJustified = CssStyleName("nav-justified")
    def navStacked = CssStyleName("nav-stacked")
    def navPills = CssStyleName("nav-pills")
    def navTabs = CssStyleName("nav-tabs")
    def navTabsJustified = CssStyleName("nav-tabs-justified")
    def breadcrumb = CssStyleName("breadcrumb")
  }

  object Label {
    def badge = CssStyleName("badge")
    def label = CssStyleName("label")
    def labelDanger = CssStyleName("label-danger")
    def labelDefault = CssStyleName("label-default")
    def labelInfo = CssStyleName("label-info")
    def labelPrimary = CssStyleName("label-primary")
    def labelSuccess = CssStyleName("label-success")
    def labelWarning = CssStyleName("label-warning")
  }

  object Media {
    def media = CssStyleName("media")
    def mediaBody = CssStyleName("media-body")
    def mediaHeading = CssStyleName("media-heading")
    def mediaList = CssStyleName("media-list")
    def mediaObject = CssStyleName("media-object")
    def mediaLeft = CssStyleName("media-left")
    def mediaMiddle = CssStyleName("media-middle")
    def mediaRight = CssStyleName("media-right")
  }

  object Modal {
    def modal = CssStyleName("modal")
    def modalBackdrop = CssStyleName("modal-backdrop")
    def modalBody = CssStyleName("modal-body")
    def modalContent = CssStyleName("modal-content")
    def modalDialog = CssStyleName("modal-dialog")
    def modalFooter = CssStyleName("modal-footer")
    def modalHeader = CssStyleName("modal-header")
    def modalLarge = CssStyleName("modal-lg")
    def modalOpen = CssStyleName("modal-open")
    def modalSmall = CssStyleName("modal-sm")
    def modalTitle = CssStyleName("modal-title")
  }

  object Pagination {
    def pagination = CssStyleName("pagination")
    def paginationLg = CssStyleName("pagination-lg")
    def paginationSm = CssStyleName("pagination-sm")
    def pager = CssStyleName("pager")
  }

  object Panel {
    def panel = CssStyleName("panel")
    def panelBody = CssStyleName("panel-body")
    def panelCollapse = CssStyleName("panel-collapse")
    def panelDanger = CssStyleName("panel-danger")
    def panelDefault = CssStyleName("panel-default")
    def panelFooter = CssStyleName("panel-footer")
    def panelGroup = CssStyleName("panel-group")
    def panelHeading = CssStyleName("panel-heading")
    def panelInfo = CssStyleName("panel-info")
    def panelPrimary = CssStyleName("panel-primary")
    def panelSuccess = CssStyleName("panel-success")
    def panelTitle = CssStyleName("panel-title")
    def panelWarning = CssStyleName("panel-warning")
  }

  object Popover {
    def popover = CssStyleName("popover")
    def popoverContent = CssStyleName("popover-content")
    def popoverTitle = CssStyleName("popover-title")
  }

  object ProgressBar {
    def progress = CssStyleName("progress")
    def progressBar = CssStyleName("progress-bar")
    def progressBarDanger = CssStyleName("progress-bar-danger")
    def progressBarInfo = CssStyleName("progress-bar-info")
    def progressBarSuccess = CssStyleName("progress-bar-success")
    def progressBarWarning = CssStyleName("progress-bar-warning")
    def progressBarStriped = CssStyleName("progress-bar-striped")
  }

  object Tooltip {
    def tooltip = CssStyleName("tooltip")
    def tooltipArrow = CssStyleName("tooltip-arrow")
    def tooltipInner = CssStyleName("tooltip-inner")
  }

  object EmbedResponsive {
    def embed = CssStyleName("embed-responsive")
    def item = CssStyleName("embed-responsive-item")
    def embed16by9 = CssStyleName("embed-responsive-16by9")
    def embed4by3 = CssStyleName("embed-responsive-4by3")
  }
}