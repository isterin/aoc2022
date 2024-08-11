package com.ilyasterin.aoc2022
package day2

object Runner {

  def main(args: Array[String]): Unit = {
    println(part1())
  }

  def part1(): Int = {
    val map = Map(
      "A" -> 1,
      "B" -> 2,
      "C" -> 3,
      "X" -> 1,
      "Y" -> 2,
      "Z" -> 3
    )
    Utils.classpathFileToLines("day2/input.txt").map { l =>
      val (a: Int, b: Int) = {
        Tuple.fromArray(l.split(" ").map(map(_)))
      }
      (a, b) match {
        case (a, b) if a == b => b + 3
        case (1, 3) => 3
        case (3, 1) => 1 + 6
        case (a, b) if a < b => b + 6
        case (_, b) => b
      }
    }.sum
  }

}
