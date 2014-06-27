package com.lduan.hw4

class NonEmptyStack[T](elem: T, rest: Stack[T]) extends Stack[T] {
  def isEmpty = false
  def top = elem
  def pop = rest
}