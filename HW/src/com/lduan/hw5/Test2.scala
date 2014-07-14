package com.lduan.hw5

import scala.concurrent.{ Future, future }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{ Failure, Success }
import scala.util.Random
object Test2 extends App {
  println("starting futures")
  val result1 = Cloud2.runAlgorithm(10)
 
  println("before for-comprehension")
  val result = for {
    r1 <- result1
  
  } yield (r1)
  println("before onSuccess")
  result onSuccess {
    case result => println(s"total = $result")
  }
  println("before sleep at the end")
 // Thread.sleep(2000) // keep the jvm alive
}

object Cloud2 {
  def runAlgorithm(count: Int): Future[Array[Int]] = future {
  val myArray = new Array[Int](count)
    myArray
  }
}