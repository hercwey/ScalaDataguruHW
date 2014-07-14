package com.lduan.hw2

class ClassExercise2 {

}

object ClassExercise2 {
  def main(args: Array[String]) {
    val A = new Array[Int](10)
    A(7) = 57
    val B = A.toBuffer
   val cc =  B.remove(2, 2)
    for (i <- 1 to (B.length, 2)) print(B(i)+",")
  }

}