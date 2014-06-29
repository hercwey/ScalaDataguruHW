package com.lduan.hw4

import java.util.Stack

abstract class Stack[T] {
  var mystack = new java.util.Stack[T]();
  def push(x: T): Stack[T] =
    {
     val temp = new NonEmptyStack[T](x, this)
   //  mystack.push(temp)
     temp
    }
  def isEmpty: Boolean
  def top: T
  def pop: Stack[T]
}