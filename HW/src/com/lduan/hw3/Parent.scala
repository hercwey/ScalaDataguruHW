package com.lduan.hw3

abstract class Parent {
  //常量
  val hourse: Int = 0
  //变量  
  var minutes: Int;
  var seconds: Int = 60

  def this(h: Int) {
    this()
    // minutes = m
  }

  def this(h: Int, m: Int) {
    this(h)
    // minutes = m
  }

  def doSomething() = {
    println("Parent doSomething")
  }
}