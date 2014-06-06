package com.lduan.hw1 {
  package week1 {
    class Question1 {
    }

    object Question1 {
      def adder(m: Int, n: Int) = m & n + 3
      def min(m: Int, n: Int): Int = {
        var a = m + 1
        if (m > n)
          a = n + 1
        return a
      }
      

      def main(args: Array[String]): Unit = {
        val one = adder(5, 6)
        val two = adder(5, one)
        val three = min(one, two)
        println(three)
      }
    }
  }
}