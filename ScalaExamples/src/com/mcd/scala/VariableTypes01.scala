package com.mcd.scala

object VariableTypes01 {
  def main(args: Array[String]): Unit = {
    
    // val variable types --> this is immutable
    
    val a="khaja"+"Asmath" + 1718178
    println("Type inteference is added by default in java so result of a is String "+a);
     //a=a+"cannot add vaue"; --> Error is thrown at this place
    var b="khaja"+"Asmath" + 1718178;
    b=b+" Mohammed"
    println("Type inteference is added by default in java so result of a is String and it is mutable for var "+b);
    //var variable types --> this is mutable.
    
  }
}