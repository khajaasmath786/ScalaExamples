package com.mcd.scala

object ForLoopYield08 extends App {
  val x=for(i<-1 to 10) yield (i*10)
  
  // like for in java 1.6
  
  for(i<-x)println(i)
  println("X become collection with yield"+x)
  
}