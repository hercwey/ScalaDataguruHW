package com.lduan.hw5

import scala.concurrent.{ Future, future }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{ Failure, Success }
import scala.util.Random
object TestRunningMultiple extends App {
  println("starting futures")
  val result1 = Cloud1.runAlgorithm(10)
  val result2 = Cloud1.runAlgorithm(10)
  val result3 = Cloud1.runAlgorithm(10)

  println("before for-comprehension")

  // val result = 
  val result = for {
    r1: Array[Int] <- result1
    r2: Array[Int] <- result2
    r3: Array[Int] <- result3
  } yield (r1 ++ r2 ++ r3)
  println("before onSuccess")
  result onSuccess {
    case result =>
      result foreach println
      println(result.length)
  }
  println("before sleep at the end")
  Thread.sleep(2000) // keep the jvm alive
}

object Cloud1 {
  def runAlgorithm(count: Int): Future[Array[Int]] = future {
    val myArray = new Array[Int](count)
    var sums = 0;
    for (i <- 0 to (count - 1)) {
      val index = Random.nextInt(myArray.length)
      myArray(i) = index
      sums = sums + index
    }
    myArray

  }
}