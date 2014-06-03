package com.lduan.hw2


class Hw2 {}

object Hw2 {
  def main(args: Array[String]) {
    val m = Map(1 -> "a", 3 -> "c", 4 -> "d", 5 -> "e", 2 -> "b")
    var t = scala.collection.immutable.TreeMap[Int, String]()
    t ++= m
    println(m);
    println(t);
    var t2 = scala.collection.mutable.Map[Int, String]()
    t2 ++= m
    t2 += (6 -> "f", 7 -> "g", 8 -> "h")
    println(t2);
    t2(1) = "aa"
    t2(2) = "bb"
    println(t2);
  }

}