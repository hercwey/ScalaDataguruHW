package com.lduan.hw3
/**
 *  * 构造Time的子类clock，构造对象时通过参数获取其初始时间（起码2种构造器），实现时钟的功能（不必每次调用方法增加1s，可以每次调用方法增加30s），同时实现整点报时
 */
class Clock extends AbsTime with AddTime {
  

  def this(h: Int, min: Int) {
    this()
    this.hours = h
    this.minutes = min
  }

  def this(h: Int, min: Int, sec: Int) {
    this(h, min)
    this.second = sec
  }
  override def toString(): String = {
    hours + " : " + minutes + " : " + second
  }
}