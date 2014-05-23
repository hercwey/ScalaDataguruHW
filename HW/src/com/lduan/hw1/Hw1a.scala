package com.lduan.hw1

class Hw1a {
}
object Hw1a {
  def main(args: Array[String]) {
    println("Hw1a");
    val one = adder(5, 6)
    println("one " + one);
    val two = adder(5, one)
    println("two " + two);
    val three = min(one, two)
    println(three)
    
  }

  def adder(m: Int, n: Int) = m & n + 3
  def min(m: Int, n: Int): Int = {
    var a = m + 1
    if (m > n) a = n + 1
    return a
  }

}


