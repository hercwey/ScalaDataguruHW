package com.lduan.hw2

import scala.collection.mutable.ArrayBuffer

class Hw3 {}

object Hw3 {
  def main(args: Array[String]) {
    var arrays = Array(1, 2, 3, 4, 1, 2)
    println(checkArray(arrays))
  }
  def checkArray(a: Array[Int]) = {
    var m = scala.collection.mutable.Map[Int, Int]()
    var buf = new ArrayBuffer[Int]()
    for (a1 <- a) {
      if (m.contains(a1)) {
        buf += (a1 + 1)
      } else {
        buf += a1
        m+=(a1->a1)
      }
      
      
      
      
    }
    buf
  }
}
