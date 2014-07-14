package com.lduan.hw5

import scala.util.Random
import scala.collection.mutable.ArrayBuffer

object test {
  val number = 10

  def main(args: Array[String]) {

    val myArray = new Array[Int](number + 1)
    var sums = 0
    for (i <- 0 to (number - 1)) {
      val index = Random.nextInt(myArray.length)
      myArray(i) = index
      sums = sums + index
    }
    myArray(number) = sums

    val bf = myArray.toBuffer
  bf.remove(10)
    bf foreach { elem => println(elem) }
  }
}