package com.lduan.hw5

import scala.actors._
import scala.util.Random
class CreateArray extends Actor {
  def act() {
    Actor.loop {
      react {
        case count: Int =>          
          reply(createArray(count))
        case _ => exit()
      }
    }
  }
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