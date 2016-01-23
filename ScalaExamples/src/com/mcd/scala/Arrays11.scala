package com.mcd.scala

object Arrays11 extends App {

  println("NOTE: you use new operator when defining the size for Array, else the values without New operator. when it doesnt have any value specify new")
  val intArray = new Array[Int](10);
  val stringArray = new Array[String](5);
  val c = Array("Hello", "World");

  // adding values to arrays
  //You can use :+ to append element to array and +: to prepend it
  println("----------------------------")
  println("Appending the array element with :+ or +: will create new array as array is immutable in scala")
  val d=intArray:+4;
  val e =1+:d;
  e(5)=25;
  println("----------------------------")
  println("printing values after adding to arrray --> see the output as it took default values for array size")
  for (appendedarray <- e) {
    println(appendedarray);
  }
  println("----------------------------")
  println("printing default values of string array")
  for (stringarr <- stringArray) {
    println(stringarr);
  }
println("----------------------------")
  println("printing values of string array after adding at indexes")
  stringArray(0)="Apple";
  stringArray(2)="banana";
  for (stringarr <- stringArray) {
    println(stringarr);
  }
  
    println("----------------------------")
  for (a <- c) {
    println(a);
  }

}