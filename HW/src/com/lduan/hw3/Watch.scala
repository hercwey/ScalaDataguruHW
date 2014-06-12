package com.lduan.hw3

/**
 * * 构造Time的子类watch，实现时钟的功能，实现定时报时的功能
 */
class Watch(h: Int, min: Int) extends AbsTime with AddTime {

  

  def alert(hour: Int, min: Int) {
    //  if(hour==this.hours&&min==this.minutes)println("Alert!! Time is "+h+ " : "+min)
    if (hour == h && min == min) println("Alert!! Time is " + h + " : " + min)
  }

}