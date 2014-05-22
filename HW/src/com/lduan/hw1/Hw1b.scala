package com.lduan.hw1

class Hw1b {

}

object Hw1b {
  def main(args: Array[String]) {
    println("Hw1b");
    //val one = adder(5, 6)
    var one = adder(5, 6)
    one = adder(5, one)
    val three = min(one, 4)
    println(three)
  }

  def adder(m: Int, n: Int) = m & n + 3
  def min(m: Int, n: Int) = {
   // m = m + 1
    var retuenM = m+1;
    if (m > n) retuenM = n + 1
    retuenM
  }

}