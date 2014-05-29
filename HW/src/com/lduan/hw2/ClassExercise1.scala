package com.lduan.hw2

class ClassExercise1 {

}

object ClassExercise1 {
  def main(args: Array[String]) {
    println("ClassExercise1");
    val m = "Scala"
    println(hello(m))

    val a:Int = 58
    val b:Int = sign(a)
    val c = sign(b)
    println(b * c)
  }

  def hello(m: String) = {
    var a = 1
    for (i <- m) {
      println(i)
      a = a * i
      println("a =" + a)
      if (a % 2 == 0) a = a - 1
      else a
    }
  }
  def sign(m: Int) :Int = {
    m % 3 match {
      case 0 => "wrong".toInt
      case 1 => 'A'
      case 2 => '\123'
    }
  }

}