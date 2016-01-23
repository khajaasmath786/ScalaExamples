package com.mcd.scala

import com.sun.javafx.geom.Area

object Procedures10 {
  def main(args: Array[String]): Unit = {
    
    //Procedures are the functions which dont return any value like void so it is unit in scala.
    // If there is function without = then the return type is unit so it is called procedure.
    
    def rectangleArea(length:Double,breadth:Double)
    {
      val area=length*breadth;
      println("area of rectangle  "+area)
    }
    
    
   rectangleArea(10,20);
   
   println("Procedures are the functions which dont return any value like void so it is unit in scala.")
   println("If there is function without = then the return type is unit so it is called procedure.")
  }

}