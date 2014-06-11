package com.lduan.hw3


/**
 * * 构造Time的子类watch，实现时钟的功能，实现定时报时的功能
 */
class Watch (h: Int, min: Int)extends Clock(h: Int, min: Int) {
  def alert(h: Int, min: Int){
      if(h==this.hours&&min==this.minutes)println("Alert!! Time is "+h+ " : "+min)
  } 
 
}