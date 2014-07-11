package com.lduan.hw5

import java.util.Calendar
import scala.util.Random
import scala.concurrent.Await
import scala.actors.Future
import scala.concurrent.impl.Future
import scala.actors.Actor

class Hw1Actor {

}
object Hw1Actor {
  val number = 10000

  def main(args: Array[String]) {
    println("HW1Actor");
    println("Start time : " + Calendar.getInstance().getTime())
    val sumArray = new Array[Array[Int]](number)
    var total = 0
    for (i <- 0 to (number - 1)) {
      val r = new CreateArray
      r.start
      val b = r !? number
      val (sums: Int, tempArray: Array[Int]) = b
      sumArray(i) = tempArray
      total = total + sums
      r ! "stop"
    }

    println("Total is " + total)
    println("Average is " + total / (number * number))

    println("End time : " + Calendar.getInstance().getTime())

  }
}