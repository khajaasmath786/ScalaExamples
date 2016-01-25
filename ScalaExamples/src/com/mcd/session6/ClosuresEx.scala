package com.mcd.session6

class ClosuresEx {
  
  
}

object closuersEx extends App
{
  
  
  def mulByFactor(factor:Double)={x:Double => x*factor} //Missing parameter type . You have to give pararmeter for x here when using other closure var. Input parameter is x here and factor is 
  
  
  val triple=mulByFactor(3);
  println("Triple Value"+triple)
  
    val half=mulByFactor(0.5);
  println("half Value"+half)
  
  println(triple(15) + " ....."+half(12));
  
}