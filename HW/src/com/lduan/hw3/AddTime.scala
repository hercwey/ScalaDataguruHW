package com.lduan.hw3
/**
 * 实现时钟的功能（不必每次调用方法增加1s，可以每次调用方法增加30s），同时实现整点报时
 */
trait AddTime {

  def doSomething(c: Clock) = {
    var hours: Int = c.hours
    var minutes: Int = c.minutes
    var second: Int = c.second
    if(minutes==0&&second==0)println("Hours is "+hours)
    if (second == 30) {
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
      second = 30
    }
     if(minutes==0&&second==0)println("Hours is "+hours)
     c.hours=hours;
     c.minutes=minutes;
     c.second=second;
  }
}