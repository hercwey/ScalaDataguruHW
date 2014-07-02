package com.lduan.hw4

class NonEmptyStack[T](elem: T, rest: Stack[T]) extends Stack[T] {
  def isEmpty = false
  def top = elem
  def pop = rest
  def size():Int ={
    var temp = this.pop
    var count=1;
      while(!temp.isInstanceOf[EmptyStack[T]]){         
         count=count+1
         temp =temp.pop
      }
      count   
  } 
  def getElem(index:Int): Stack[T]={
    if(index>size())
       throw new Exception("Out of boundary！") 
    var elem:  Stack[T]=null
    for(a <- 1 to index){
        elem=this.pop  
    }
     elem
  }
}