package com.lduan.hw4
/**
 * def accuracy    (b:Double,next:Double) = (b-next*next)*(b-next*next)>0.00001
 * def accuracy(guess:Double,next:Double) = (guess-next)*(guess-next)>0.00001
 *  随堂练习1
 * 把accuracy函数类似上面的抽象化，使之成为一个生成一系列精确度判断函数的函数要求如下：
 * def accuracy(f)(t:Double) //f为计算精确度的函数，t为精确度
 * def acc1(a:Double,b:Double)=accuracy(f)(t) //acc1为具体计算精确度的函数
 */
class ClassExercise1 {

}

object ClassExercise1 {
  def main(args: Array[String]) {
    println("ClassExercise1");
    val test1 = accuracy(acc1)_
    val test2 = test1(1, 2)
    println(test2)
    val test3 = accuracy(acc2)_
    val test4 = test3(1, 2)
    println(test4)

  }
  //   def ffff(cc:(Int,Int) => Int)(s:Int,z:Int)=cc(s,z)+z
  def accuracy(f: (Double, Double) => Double)(a1: Double, a2: Double) = f(a1, a2) > 0.0001
  def acc1(b: Double, next: Double) = (b - next * next) * (b - next * next)
  def acc2(b: Double, next: Double) = (b - next) * (b - next)

}