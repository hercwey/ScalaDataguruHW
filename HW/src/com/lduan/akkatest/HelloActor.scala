package com.lduan.akkatest

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor._
class HelloActor(myName: String) extends Actor {
  def receive = {
    // (2) println statements changed to show the name
    case "hello" => println(s"hello from $myName")
    case 1=>  println(1)
    case _ => println(s"'huh?', said $myName")
  }
}
object Main extends App {
  // an actor needs an ActorSystem
  val system = ActorSystem("HelloSystem")
  // create and start the actor
  val helloActor = system.actorOf(Props(new HelloActor("lduan")), name = "helloactor")
  // send the actor two messages
  helloActor ! "hello"
  helloActor ! "buenos dias"
  helloActor ! 1
  // shut down the system
  system.shutdown
}