package com.lduan.hw5

import java.util.Calendar

import scala.util.Random

class Hw1 {

}
object Hw1 {
  val number = 10000
  def main(args: Array[String]) {
    println("HW1");
    println("Start time : " + Calendar.getInstance().getTime())
    val sumArray = new Array[Array[Int]](number)
    var total = 0
    for (i <- 0 to (number - 1)) {
      val (sums, tempArray: Array[Int]) = createArray(number)
      sumArray(i) = tempArray
      total = total + sums
    }
    println("Total is " + total)
    println("Average is " + total / (number * number))

    println("End time : " + Calendar.getInstance().getTime())
  }
  /**
   * create a array to store random
   */
  def createArray(count: Int) = {
    val myArray = new Array[Int](count)
    var sums = 0;
    for (i <- 0 to (count - 1)) {
      val index = Random.nextInt(myArray.length)
      myArray(i) = index
      sums = sums + index
    }

    val pair = (sums, myArray)
    pair
  }

}