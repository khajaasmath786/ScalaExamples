package com.mcd.session2

abstract class AbstractClass09 {
  def empDetails(id:Int);
  
  
}

class EmpDetails extends AbstractClass09
{
  //no need to mention override tag but you can mention it explicitly if you are comfortable with it
 def empDetails(id:Int)=
  {
    println("Employee details from emplyeedid "+id)
  }
}

object abstractObject extends App
{
  val emp=new EmpDetails();
  emp.empDetails(171878)
}