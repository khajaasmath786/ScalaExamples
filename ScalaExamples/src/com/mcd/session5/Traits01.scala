package com.mcd.session5

trait Logger1
{
  def log (msg:String) // This is abstract method as we didnt provide any implementation. No need to declare abstract
  
  // Also traits can have both concrete and abstract methods
}

class ConsoleLogger extends Logger1 // as you see, it is extends not implements in scala 
{
   def log (msg:String)
   {
     println("Logging the message from the sub classes using traits by implementing the abstract method of trait -->" + msg)
   }
}

object TraitExample extends App  // Make sure you have app here or main method. I saw this issue where you cannot see run as scala application.
{
  var traitObj=new ConsoleLogger();
  traitObj.log("calling methods of traits");
}

// Example 2 with concrete methods.

