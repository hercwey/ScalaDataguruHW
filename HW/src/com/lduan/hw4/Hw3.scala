package com.lduan.hw4

class Hw3 {

}

object Hw3 {
  def main(args: Array[String]) {
    println("HW3");
    val array = Array[Int](0, 1, 2, 3, 4, 5, 6, 7, 8)
    val temp1 = changeLocation[Int](2, 3)_
    temp1(array)
  }

  def changeLocation[T](x: Int, y: Int)(array: Array[T]): Unit = {
    (x, y) match {
      case _ if x > array.length => {
        println("x out of Index")
      }
      case _ if y > array.length => {
        println("y out of Index")
      }
      case _ if x == y => {
        println("x can't eque y")
      }
      case _ => {

        println("befare change")
        array foreach print
        val temp = array(x - 1)
        array(x - 1) = array(y - 1)
        array(y - 1) = temp
        println("")
        println("after change")
        array foreach print
      }
    }
  }
  //   def ffff(cc:(Int,Int) => Int)(s:Int,z:Int)=cc(s,z)+z

}