package com.mcd.session2

class CompanionObject07 {
  var resNumber=CompanionObject07.newReservation(); // Here is the place where class is calling companion object similar to java. 
  
}

object CompanionObject07 { 
  // This is singleton object as it is created with Object
  var lastNumber=1;
  def newReservation() =
  {
    lastNumber=lastNumber+1;
    lastNumber
  }
  
  def callingonlyComapnionFromApp()
  {
    println("Method of companion object is called with objectname.methodname.. Used in above class also")
  }
}

object CompanionObjectApp07 extends App
{
var comObj=new CompanionObject07;
println(comObj.resNumber); // getting the value of variable from class which is accessor method here.

println("----------------------------------------------")

println("Calling method of object similar to static method in java")
CompanionObject07.callingonlyComapnionFromApp();

}
