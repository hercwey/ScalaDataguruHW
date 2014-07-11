package com.lduan.akkatest

import scala.concurrent.{ Future, future }
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{ Failure, Success }
import scala.util.Random
object Hw11RunningMultipleCalcs extends App {
  
   def merge[K, V](maps: Seq[Map[K, V]])(f: (K, V, V) => V): Map[K, V] = {
    maps.foldLeft(Map.empty[K, V]) { case (merged, m) =>
      m.foldLeft(merged) { case (acc, (k, v)) =>
        acc.get(k) match {
          case Some(existing) => acc.updated(k, f(k, existing, v))
          case None => acc.updated(k, v)
        }
      }
    }
  }
  
  println("starting futures")
  val result1 = CloudBase.createArray(3333)
  val result2 = CloudBase.createArray(3333)
  val result3 = CloudBase.createArray(3333)
  println("before for-comprehension")
  val t_maps = Seq(result1, result2)
    val tt_maps = Seq(t_maps, result3)
  
    
  println("before onSuccess")
    result onSuccess {
     case result => println(s"total = $result")
   }
  println("before sleep at the end")
  
  Thread.sleep(2000) // keep the jvm alive
}

object CloudBase {
  def createArray(count: Int): Future[scala.collection.immutable.Map[Int, Array[Int]]] = {
    val myArray = new Array[Int](count)
    var sums: Int = 0;
    for (i <- 0 to (count - 1)) {
      val index = Random.nextInt(myArray.length)
      myArray(i) = index
      sums = sums + index
    }
    // val pair:(Int,Array[Int]) = (sums, myArray)
    val romanNumeral = scala.collection.immutable.Map[Int, Array[Int]](sums -> myArray)
    Future { romanNumeral }
  }
}


