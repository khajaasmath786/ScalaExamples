package com.mcd.session2

import org.omg.CORBA.Object

class ClassReadOnlyCounter {
  private var counter=22;
  def incrementCounter()=   // methods are public by default
  {
   counter=counter+1;
    counter; // retrun should always have data type defined.
  }
  
  def getCounter()= // methods are public by default
  {
   counter;// retrun should always have data type defined.
  }
    
}

object ReadOnlyCtr extends App
{
  var incObj=new ClassReadOnlyCounter;
  
  incObj.incrementCounter();
  println("Counter after incrementing value --> "+incObj.getCounter());
}