package com.lduan.hw5

import akka.actor._
import scala.util.Random
import akka.util.Timeout
import scala.concurrent.duration.Duration
import scala.actors.threadpool.TimeUnit

//http://alvinalexander.com/scala/scala-akka-actors-ask-examples-future-await-timeout-result
import akka.actor._
import akka.dispatch.
import akka.dispatch.Future
import akka.pattern.ask
import akka.util.Timeout
import akka.util.duration._


case class CreateChild(name: String)
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
  var sumArray=new Array[Int](0)
  val count = 10;
  def receive = {
    case CreateChild(name) =>
      // Parent creates a new Child here
      println(s"Parent about to create Child ($name) ...")
      val child = context.actorOf(Props[AlgorithmChild], name = s"$name")
      child ! Create(count)
    case ReturnArray(myArray) =>
      sumArray=sumArray++myArray
      sumArray foreach println
      println(s"--------------")
       case "test" => sender ! sumArray
    case _ => println(s"Parent got some other message.")
  }
}
object AlgorithmParentApp extends App {
  val actorSystem = ActorSystem("ParentChildTest")
  val parent = actorSystem.actorOf(Props[AlgorithmParent], name = "Parent")
  // send messages to Parent to create to child actors
  parent ! CreateChild("task1")
  parent ! CreateChild("task2")
 // Thread.sleep(500)
  // lookup Jonathan, then kill it
 // println("Sending Jonathan a PoisonPill ...")
 // val jonathan = actorSystem.actorSelection("/user/Parent/task1")
 // jonathan ! PoisonPill
 // println("jonathan was killed")
  Thread.sleep(50000)
  implicit val timeout = Timeout(Duration(1, TimeUnit.SECONDS))
  val test = Await.result(parent ? "test", Duration(1, TimeUnit.SECONDS))
  actorSystem.shutdown
}