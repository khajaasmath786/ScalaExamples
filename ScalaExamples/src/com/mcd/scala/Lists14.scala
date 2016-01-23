package com.mcd.scala

object Lists14 extends App {
  var list=List(1,2,3)
  
  println("List is either null or combination of Head and Tail. tail is again a list where as head is just element")
  
  
  println("----------------------------------");
  val head=list.head;
  val listTail=list.tail;
  println("Head is just element --> "+head)
  println("Tail is again list --> "+listTail)
  
  println("----------------------------------");
  
  
  
  println("-----> Adding elements to list with ::, it will add only to head not the tail--------------- ")
  
  val listnew=2::list;
  val listnewer=3::list;
  println("New list after adding elememt. it will add only to head not the tail. This is new list it cannot be old one--> "+listnew)
  
  
  println("******************************************************************")
  var listone=List(1)
  
  println( "will return head "+listone.head)
  println( "This will return null as it has only one element -> "+listone.tail)
  
  //
}