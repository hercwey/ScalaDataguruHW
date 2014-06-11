package com.lduan.hw3

class Hw1 {

}

object Hw1 {
  def main(args: Array[String]) {
    println("HW1");
    val c = new Clock(9,0,0) 
    c.doSomething(c)
     println(c.toString())
    c.doSomething(c)
    println(c.toString())
    val w = new Watch(9,0)   
    w.alert(9, 0)
    w.doSomething(w);
  }
}