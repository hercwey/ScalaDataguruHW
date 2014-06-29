package com.lduan.hw4
import com.lduan.hw3._;
/**
 *  抽象化上一周作业的代码
 *  实现时钟的功能（不必每次调用方法增加1s，可以每次调用方法增加30s），同时实现整点报时
 */
trait AddTime {
  var hours: Int = 0;

  var minutes: Int = 0;

  var second: Int = 0;

  def doSomething(c: Clock) = {
    var hours: Int = c.hours
    var minutes: Int = c.minutes
    var second: Int = c.second    
 
     second = calculate(addMinOrSec)(second,60)
    if(second==0) 
      minutes=calculate(addMinOrSec)(minutes+1,60)
    else
      minutes=calculate(addMinOrSec)(minutes,60)
     if(minutes==0) 
      hours=calculate(addMinOrSec)(hours+1,24)
     else
       hours=calculate(addMinOrSec)(hours,24)
      /* 
    if (second == 59) {
      second = 0;
      if (minutes == 59) {
        minutes = 0
        if (hours < 23) {
          hours = hours + 1
        } else {
          hours = 0
        }
      } else {
        minutes = minutes + 1
      }
    } else {
      second = second + 1
    }
    * 
    */
    if (minutes == 0 && second == 0) println("Hours is " + hours)
    c.hours = hours;
    c.minutes = minutes;
    c.second = second;
  }
  def calculate(f: (Int) => Int)(a1: Int, a2: Int) = {
    if (f(a1) == a2-1) {
      0
    } else {
      a1 + 1
    }

  }
  def addMinOrSec(a1:Int):Int={
    a1+1
    
  }
  //def accuracy(f: (Double, Double) => Double)(a1: Double, a2: Double) = f(a1, a2) > 0.0001
}