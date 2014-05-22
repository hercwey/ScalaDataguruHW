package com.lduan.hw1

class Hw12 {

}

object Hw12 {
  def main(args: Array[String]) {
    println("Hw12");
    var m = toInt("hello");
    println(m);
    var m2 = toInt("111");
    println(m2);
  }

  def toInt(s: String): Int = {
    try {
      s.toInt
    } catch {
      case e: Exception => 0
    }
  }

}