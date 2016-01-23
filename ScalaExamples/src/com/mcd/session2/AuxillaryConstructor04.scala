package com.mcd.session2

class AuxillaryConstructor04
{
  var size=0; //class variables should be initialized in scala
  var age=0; //class variables should be initialized in scala
  
  def this(size:Int)
  {
    this(); // calls primary constructor
    this.size=size;    
  }
  
  def this(size:Int,age:Int)
  {
    this(size); // calls Auxillary constructor
    this.age=age;    
  }
}

object AuxConst extends App
{
  var obj=new AuxillaryConstructor04;
  var objaux=new AuxillaryConstructor04(5);
  var objau=new AuxillaryConstructor04(5,10);
  
  println(obj.size,obj.age); // obj.size  here is accessor method. also println is functon returning tuples here with , see output
  println(objaux.size,objaux.age); // obj.size  here is accessor method. also println is functon returning tuples here with , see output
  println(objau.size,objau.age); // obj.size  here is accessor method. also println is functon returning tuples here with , see output
}


