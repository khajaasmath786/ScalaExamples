package com.mcd.session2

object SingletonObject06 { // This is singleton object as it is created with Object
  var lastNumber=1;
  def newReservation() =
  {
    lastNumber=lastNumber+1;
    lastNumber
  }
}


object SingletonObjAccess extends App
{
  //var objOfSingleton=new SingletonObject06(); // Not Ok. as you cannot create object of object
  
  println("Call methods of singleton object with SingleTonObjectName.methodname")
  SingletonObject06.newReservation();
  var numFromSingletonObj= SingletonObject06.lastNumber;
  println("number From Singleton Obj "+numFromSingletonObj)
}