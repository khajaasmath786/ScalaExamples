package com.mcd.scala

object ArraysSortOperations11 extends App {
  var a= Array(1,9,7,22,15);
  val max=a.max;
  val min=a.min;
  val sum=a.sum;
  println("Maximum value in an array"+max)
  println("Minimum value in an array"+min)
  println("Sum of an array"+sum)
  scala.util.Sorting.quickSort(a);
  println("Array after sorting --> "+a.mkString("*"));
  
}