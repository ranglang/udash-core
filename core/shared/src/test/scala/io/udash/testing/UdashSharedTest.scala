package io.udash.testing

import org.scalatest.{AsyncWordSpec, BeforeAndAfterAll, Matchers, WordSpec}

trait UdashSharedTest extends WordSpec with Matchers with BeforeAndAfterAll
trait AsyncUdashSharedTest extends AsyncWordSpec with Matchers with BeforeAndAfterAll
