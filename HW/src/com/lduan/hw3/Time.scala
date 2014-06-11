package com.lduan.hw3

/**
 * 编写一个Time类，加入私有属性hours和minutes
 * 加入方法get，查询当前的hours和minutes的值，并输出（hours：minutes）
 * 加入方法do，minutes自增1，若minutes=60时重置为0，且hours增1，若hours=24时重置为0
 * Time对象的构造形式为new Time(h,min)，h和min均为Int且0=<h<23,0=<min<59
 */
class Time (){
  private var hours: Int = 0
  private var minutes: Int = 0
  
  def this(h:Int,min:Int){
      this()
      if(h<0||h>=23){
           throw new Exception("h is illegal")        
      }
      if(min<0||h>=59){
           throw new Exception("min is illegal")        
      }
      this.hours=h
      this.minutes=min
      
  }
  def getTime() = { hours + " : " + minutes }
  def doSomething() = {

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

  }

}