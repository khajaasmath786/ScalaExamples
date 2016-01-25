package com.mcd.session6



class MapFilterReduceEx {
  
  def functionsEx()=
  {
    
    // Map Functions --> It takes function as argument and apply to each and every elements passed to it as a range.
    (1 to 9).map(0.1 * _);
    (1 to 9).map(x => 0.1 * x); // This is lambda expresssions.
    
    
    //foreach
    (1 to 9).map(0.1 * _).foreach(println);
    println("----------------println_---------------------------")
       (1 to 9).map(0.1 * _).foreach(println _);
    println("-------------------------------------------")
    (1 to 9).map(x => 0.1 * x).foreach(x => println(x));
    
    //filter function
    println("-------------------------------------------")
    (1 to 9).filter(_%2==0).foreach { x => println(x) }
    println("-------------------------------------------")
    (1 to 9).filter(_%2==0).foreach { println }
    
    // reduce left, it takes each element and do the addition
    
    println((1 to 9).reduceLeft(_*_))
  }
  
}

object MapFilterEx extends App
{
  
  var x=new MapFilterReduceEx
  x.functionsEx();
}