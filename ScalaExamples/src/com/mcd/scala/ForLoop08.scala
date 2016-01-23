package com.mcd.scala

object ForLoop08 {
  def main(args: Array[String]): Unit = {
    
    //No need of initialization in for loop. It defines the range (like java we don’t need i++, i=0)
    
    //<- is syntax in scala and => is obtained from the library.
    
    //We can declare variables and do conditional checking too in for loop. See last code.
    
    for(i<-0 to 5)
    {
      println(i);
    }
    
    println("----------------------")
    
    for(i<-0 until 5)
    {
      println(i);
    }
    
    println("-------Untill For Loop Example ------------")
    var i="KhajaAsmath";
    var sum=0;
    for(i<-0 until(i.length()))
    {
      //Earlier i is string and now from for loop it became integer
      //println(i)
      sum=sum+i;
      
    }
    println("Sum after for loop with untill expression "+sum)
    println("")
     println("-------Advanced for Loop Example ------------")
     
     for(i<-1 until(5);j<-1 until(5))
     {
       println(i*j)
     }
    
     println("")
     println("-------Advanced for Loop Example with conditions in loop syntax ------------")
     
     for(i<-1 until(5);j<-1 until(5); if (i==j))
     {
       println(i*j)
     }
     
     println("")
     println("-------Advanced for Loop Example with conditions in loop syntax and variable declartions------------")
     
     for(i<-1 until(5);j<-1 until(5); if (i==j); x=10)
     {
       println(i*j*x)
     }
    
     
  }
}