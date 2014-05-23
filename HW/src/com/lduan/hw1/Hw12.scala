package com.lduan.hw1

class Hw12 {

}

object Hw12 {
  def main(args: Array[String]) {
    println("Hw12");
    var m = toInt('b');
    println(m);
    var m2 = toInt('a');
    println(m2);

    println(max(2, 3));
    println(max(7, 3));
  }

  def toInt(s: Char): Int = {
    try {
      s.toInt;

    } catch {
      case e: Exception => 0
    }
  }
  def max(a: Int, b: Int) = {
    if (a > b)
      a
    else
      b

  }

}