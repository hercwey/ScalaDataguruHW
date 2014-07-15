package com.lduan.hw5

import akka.actor._
import scala.util.Random
import akka.util.Timeout
import scala.concurrent.duration.Duration
import scala.actors.threadpool.TimeUnit
import akka.actor._
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.Await

import scala.concurrent.duration._
import akka.util.Timeout

case class CreateChild(name: String, count: Int)
case class Create(count: Int)
case class ReturnArray(a: Array[Int])
class AlgorithmChild extends Actor {
  var name = "No name"
  def receive = {
    case Create(count) => {
      println(s"count is $count")
      val myArray = new Array[Int](count + 1)
      var sums = 0
      for (i <- 0 to (count - 1)) {
        val index = Random.nextInt(myArray.length)
        myArray(i) = index
        sums = sums + index
      }
      myArray(count) = sums
      sender ! ReturnArray(myArray)
    }
    case _ => println(s"Child $name got message")
  }
}
class AlgorithmParent extends Actor {
  var sumArray = new Array[Int](0)
  def receive = {
    case CreateChild(name, count) =>
      // Parent creates a new Child here
      println(s"Parent about to create Child ($name) ...")
      val child = context.actorOf(Props[AlgorithmChild], name = s"$name")
      child ! Create(count)
    case ReturnArray(myArray) =>
     // println(sumArray.length)
     // println("#################")
      sumArray = sumArray ++ myArray
    //sumArray foreach println
    case "GetSumaArray" => sender ! sumArray
    case _ => println(s"Parent got some other message.")
  }
}
object AlgorithmParentApp extends App {
  val count = 3
  val actorSystem = ActorSystem("ParentChildTest")
  val parent = actorSystem.actorOf(Props[AlgorithmParent], name = "Parent")
  // send messages to Parent to create to child actors
  for (a <- 1 to count) {
    parent ! CreateChild("task" + a, count)
  }

  implicit val timeout = Timeout(50 seconds)
  Thread.sleep(200)
  val future = parent ? "GetSumaArray"
  val sumArray = Await.result(future, timeout.duration).asInstanceOf[Array[Int]]
  var total = 0
  var flag = true

  while (flag) {
    val len= count * count + count
    if (sumArray.length == len) {
      for (i <- 1 to count) {
        total = total + sumArray((count * i) + (i - 1))
        println("Total add " + total)
      }
      flag = false
    }

  }
  println("Array size is " + sumArray.length)
  println("Total is " + total)
  //test foreach println

  println("Done")
  actorSystem.shutdown
}