package com.lduan.hw3
/**
 * .编写满足以下要求的代码，要求用到特质
 * 构造一个抽象类Time，包含成员hours、minutes、second，包含方法get
 * 构造Time的子类clock，构造对象时通过参数获取其初始时间（起码2种构造器），实现时钟的功能（不必每次调用方法增加1s，可以每次调用方法增加30s），同时实现整点报时
 * 构造Time的子类watch，实现时钟的功能，实现定时报时的功能
 */
abstract class AbsTime {
  var hours: Int
  def getHours() = { this.hours }
  var minutes: Int
  def getMinutes() = { this.minutes }
  var second: Int
  def getSecond() = { this.second }

}