package com.mcd.scala

object Tuples13 extends App {

/*  Tuple is unordered collection of elements. 
 *  It has more than 2 elements but in case of map it is only 2 elements key and value. 
Since tuple is unordered, it can have different data types in one tuple like above example. 
In above example it’s having int and string data types in the tuple.
***Very important , index starts from 1 in tuple so a._1 is first element (or a _1) 
* */
  
  var tupleUnordered=(1,4,"Asmath","Khaja");
  println("Tuples are used when functions returns more than one value not like arrays where it returns values of same type")
  println("Tuples are unordered list of elements which atleast more than 2 values and have other data types.")
  print("Declaring as above considered as tuple by scala")
  
  println("Elements inside tuple are accessed by indexes and it starts with 1 not 0. They are accessed by ._")
  
  println("------------------------------------------")
  println("2nd element in tuple -->"+(tupleUnordered._2))
  println("4th element in tuple -->"+(tupleUnordered._4))
  
  var tuppleUpper="New Delhi Capital".partition { _.isUpper }
  println("This is utilityy function which seperates capital letter and return Tupple --> " + tuppleUpper)

}