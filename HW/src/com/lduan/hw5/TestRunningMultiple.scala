package com.lduan.hw5

import scala.concurrent.{ Future, future }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{ Failure, Success }
import scala.util.Random
import scala.collection.mutable.ArrayBuffer
object TestRunningMultiple extends App {
  val count = 10000
  println("starting futures")
  val result1 = CreatArraySum.runAlgorithm(count)
  val result2 = CreatArraySum.runAlgorithm(count)
  val result3 = CreatArraySum.runAlgorithm(count)

  println("before for-comprehension")

  val result = for {
    r1: Array[Int] <- result1
    r2: Array[Int] <- result2
    r3: Array[Int] <- result3
  } yield (r1 ++ r2 ++ r3)

  println("before onSuccess")
  result onSuccess {
    case result => {
      val t1 = result(count)
      val t2 = result((count * 2) + 1)
      val t3 = result((count * 3) + 2)
      val total = t1 + t2 + t3
      println("total is " + total)
      println("Average is " + total / (count * 3))
      val bf = result.toBuffer
      bf.remove(count)
      bf.remove(count*2)
      bf.remove(count*3)    
     // bf foreach { elem => println(elem) }
  }
}
  Thread.sleep(2000) // keep the jvm alive
}

object CreatArraySum {
  def runAlgorithm(count: Int): Future[Array[Int]] = future {
    val myArray = new Array[Int](count + 1)
    var sums = 0
    for (i <- 0 to (count - 1)) {
      val index = Random.nextInt(myArray.length)
      myArray(i) = index
      sums = sums + index
    }
    myArray(count) = sums
    myArray
  }
}