package com.lduan.hw3

class ClassExercise1 {

}

object ClassExercise1 {
  def main(args: Array[String]) {
    var t = new Time()
    println(t.getTime);
    for (c <- 1 to 25) {
      t.doSomething
      println(t.getTime);
      for (c <- 1 to 60) {
        t.doSomething
        println(t.getTime);
      }    }

    var t2 = new Time(3, 45)
    println(t2.getTime);

    var t3 = new Time(24, 59)
    println(t3.getTime);
    
  

  }

}