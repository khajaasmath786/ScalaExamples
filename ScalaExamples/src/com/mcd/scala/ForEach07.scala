package com.mcd.scala

object ForEach07 {
  def main(args: Array[String]): Unit = {

    var args = "Khaja Asmath";

    //If args.foreach(i => println(i)),  this loop is taking anonymous function with parameter i.
    // Println(i) is the body of the function and if that body is using the parameter only once after =>, 
    //then you can omit both the argument i and ().  Which makes both are same now.
    //Scala will take argument automatically, you can give any name.
    
    args.foreach { x => println(x) }
    
    // since we are using x only once after => in the body, you can omit.
    
    println("------------")
    args.foreach {println}
  }
}