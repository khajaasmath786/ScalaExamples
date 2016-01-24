package com.mcd.session5

class HigherOrderFunsWithFuncParameters10 {
  
  
  def sum(f:Int =>Int, a:Int,b:Int):Int=// See this function taking as other fnc as parameter. Return type mandatory because facorial is recursive so return type mandatory for recursive fns
  {
    if(a >b)0
    else f(a)+sum(f,a+1,b) //  here f(a) is function of scala which in turns calls app function
  }
  
  def cube(a:Int):Int=
  {
    a*a*a;
  }
  
  def fact(a:Int):Int= if(a==0) 1 else fact(a-1)  
  def id(x:Int):Int=x;
  
  def sumInts(a:Int,b:Int):Int=sum(id,a,b);
  
  def sumCubes(a:Int,b:Int):Int=sum(cube,a,b);
  
  def sumFactorials(a:Int,b:Int):Int=sum(fact,a,b)
}




object HigherOrderFunExWithParmas10 extends App
{
  
  var obj=new HigherOrderFunsWithFuncParameters10()
  
  println(obj.sumCubes(1,2))
  
}
