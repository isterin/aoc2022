package com.ilyasterin.aoc2022

import scala.io.Source

object Utils {

  val DEFAULT_PACKAGE = "com/ilyasterin/aoc2022"

  def classpathFileToLines(name: String): Iterator[String] =
    Source.fromResource(s"${DEFAULT_PACKAGE}/${name}").getLines()

}
