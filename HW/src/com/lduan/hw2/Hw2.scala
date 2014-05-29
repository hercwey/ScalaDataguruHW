package com.lduan.hw2

class Hw2 {}

object Hw2 {
  def main(args: Array[String]) {
    val m=Map(1->"a",3->"c",4->"d",5->"e",2->"b")
    var t = scala.collection.immutable.TreeMap[Int,String]()
      t ++= m
      println(m);
    print(t);
  }

}