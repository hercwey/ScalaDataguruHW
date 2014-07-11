package com.lduan.hw5

import scala.concurrent.{ Future, future }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{ Failure, Success }
import scala.util.Random
object Hw11RunningMultipleCalcs extends App {
  println("starting futures")
  val result1 = Future { createArray(3333) }
  val result2 = Future { createArray(3333) }
  val result3 = Future { createArray(3333) }

  println("before for-comprehension")

  val f1 = result1 map { x:Array[Int] => x}
  val f2 = result1 map { x:Array[Int] => x}
  val f3 = result1 map { x => x.clone }
  
  val result = for {
    r1 <- f1
    r2 <- f2
    r3 <- f3
  } yield ()
 
  println("before onSuccess")
  result onSuccess {
    case result => println(s"total = $result")
  }
  println("before sleep at the end")

  Thread.sleep(2000) // keep the jvm alive
  def createArray(count: Int): Array[Int] = {
    val myArray = new Array[Int](count)
    var sums: Int = 0;
    for (i <- 0 to (count - 1)) {
      val index = Random.nextInt(myArray.length)
      myArray(i) = index
      sums = sums + index
    }
    // val pair:(Int,Array[Int]) = (sums, myArray)
    //val romanNumeral = scala.collection.immutable.Map[Int, Array[Int]](sums -> myArray)
    myArray
  }
}



