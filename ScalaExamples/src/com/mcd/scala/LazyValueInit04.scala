package com.mcd.scala

object LazyValueInit04 {
  def main(args: Array[String]): Unit = {
    
   
    
    lazy val loadLazy=scala.io.Source.fromFile("Asmath").mkString;
    println(" You have to try this in scala prompt to see the error"+loadLazy)
    
     val loadnonLazy=scala.io.Source.fromFile("Asmath").mkString;
    println(" You have to try this in scala prompt to see the error"+loadnonLazy)
    
  }
}