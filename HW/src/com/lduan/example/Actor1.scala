package com.lduan.example
import scala.actors._, Actor._
object Actor1
  {
    def main(args : Array[String]) =
    {
      val badActor =
        actor
        {
          receive
          {
            case msg => System.out.println(msg)
          }
        }
      
      badActor ! "Do ya feel lucky, punk?"
    }
  }