package com.mcd.session2

class ClassIncrement {
  
  var counter=0;  // You must initialise the class variables in scala
  /*  def incrementCounter():Int=
  {
   counter=counter+1;
   return counter; // retrun should always have data type defined.
  }
  
  def getCounter():Int=
  {
    return counter;// retrun should always have data type defined.
  }*/
  
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

class IncrementScalaConvention {
  
  var counter=22; 
    def incrementCounter()=  // This is mutator method. scala convention use () for mutator and no () for accessor. but you can use () also if required
  {
   counter=counter+1;
    counter; 
  }
    def getCounter=  // no () for method .. This is accessor method
  {
   counter;
  }
   }


/**
 * @author mc41946
 */
object ClassIncObj extends App{
  //creating object of class
  
  var incObj=new ClassIncrement;
  
  incObj.incrementCounter();
  println("Counter after incrementing value --> "+incObj.getCounter());
  
  
  var incScObj=new IncrementScalaConvention;
  
  incScObj.incrementCounter();
  println("Accessor without () as scala convention --> "+incScObj.getCounter);
  
  
}





