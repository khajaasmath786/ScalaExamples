package com.mcd.session2

abstract class AbstractClass091 (var name: String) {
  def empDetails(id:Int);
  
  
}

// SInce you are passing name to super class constructor
class EmpDetails1(name:String) extends AbstractClass091(name)
{
  //no need to mention override tag but you can mention it explicitly if you are comfortable with it
 def empDetails(id:Int)=
  {
    println(name +" Employee details from emplyeedid "+id)
  }
}

object abstractObject1 extends App
{
  val emp=new EmpDetails1("Asmath");
  emp.empDetails(171878)
}