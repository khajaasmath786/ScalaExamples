package com.mcd.scala

object AssigningBlockExpression03 extends App {
  val x={val a=20;val b=30; a-b};
  println("By Default last value is the retrun in scala "+x)
  //Note you dont need to specify ; for line break. It is default in scala
}