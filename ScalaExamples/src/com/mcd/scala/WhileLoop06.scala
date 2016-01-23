package com.mcd.scala

object WhileLoop06 {
  def main(args: Array[String]): Unit = {
    var i=1;
    //val i=1; --> Cannot give i as val because it is modified below.
    
    while (i<10)
    {
      println(i);
     // i++;  --> Not supported in scala
     // ++i;  --> Not supported in scala
      i=i+1;
      
    }
  }
}