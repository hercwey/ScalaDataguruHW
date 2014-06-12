package com.lduan.hw3

class Children extends Parent {
  //抽象变量赋值
  var minutes: Int = 0
  //只能重写getter/setter
  // 重写 setter 方法
  seconds_= { 3 }
  override def doSomething() = {
    println("Children doSomething")
  }
}