package com.lduan.hw4

import scala.collection.mutable.Stack
/**
 * 写一个适用于泛型的查询堆栈自上往下第n个数据的函数
 */
class ClassExercise2 {

}

object ClassExercise2 {
  def main(args: Array[String]) {
    println("ClassExercise2");
    val m = new EmptyStack[Int]
    val n1 = new NonEmptyStack[Int](1, m)
    val n2 = new NonEmptyStack[Int](2, n1)
    val n3 = new NonEmptyStack[Int](3, n2)
    val n4 = new NonEmptyStack[Int](4, n2)
    println("Stack size = " + n4.size)
    val temp = n4.getElem(2)
    println("Get 3th elemet = " + temp.top)

  }

}