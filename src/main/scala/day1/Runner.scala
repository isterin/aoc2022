package com.ilyasterin.aoc2022
package day1

import scala.collection.mutable
import scala.io.Source

object Runner {

  def main(args: Array[String]): Unit = {
    val elfCalories = groupByCalories()
    println(s"TOP CALORIES: ${part1(elfCalories)}")
    println(s"TOP 3 ELF CALORIES: ${part2(elfCalories)}")
  }

  def part1(elfCalories: List[List[Int]]): Int = elfCalories.map(_.sum).max

  def part2(elfCalories: List[List[Int]]): Int = elfCalories.map(_.sum).sorted(Ordering[Int].reverse).take(3).sum

  private def groupByCalories(): List[List[Int]] = {
    val input = Source.fromResource("com/ilyasterin/aoc2022/day1/input1.txt")
    input.getLines().foldLeft(List[List[Int]](List())) { (a, b) =>
      if (b.isEmpty) {
        List() :: a
      } else {
        (b.toInt :: a.head) :: a.tail
      }
    }
  }
}
