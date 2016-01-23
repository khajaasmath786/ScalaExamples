package com.mcd.session2

class ClassPrimaryConstructor05(var ename:String,var eid:Int) { 
  // variables declared as var can only be accessed in object declartion as primConstObj.ename.
  //class ClassPrimaryConstructor05() { // Throws error as you cannot have other constructors with same name like default and parameterized in java
  
  println("Primary constructors are one way to define the method level variables and initialize them through calling constructor when cretaing object")
  
  println ("Accessing class variables --> " +ename +" id is "+eid)
  
}

class ClassPrimConst{ // Primary constrcutor without args. You cannot have primary constrcutors on same class name with diff param's like defulat and parameterized in java
  
  println("Primary constructors are one way to define the method level variables and initialize them through calling constructor when cretaing object")
  
  println ("Accessing class variables --> ")
  
}




object PrimaryConstructor extends App
{
  
  var primConstObj= new ClassPrimaryConstructor05("Asmath",171878); // Prim const with args
  
  println(primConstObj.ename)
  
  //val primConstObje= new ClassPrimaryConstructor05(); // Not Ok .. This is accepted in java but not in scala.
}

