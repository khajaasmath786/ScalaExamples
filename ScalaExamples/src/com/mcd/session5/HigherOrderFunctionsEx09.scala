package com.mcd.session5

class HigherOrderFunctionsEx09 {
  
  def sumInts(a:Int,b:Int):Int=
  {
    if(a>b) 0 else a+(sumInts(a+1, b)) // See last statement is having function as return type which in turn calls Integer
  }
  
  def HigherOtherEx(a:Int,b:Int)=
  {
    if(a>b) "A" else (sumInts(a+1, b)) // See last statement is having function as return type which in turn returns string or Integer
  }
  
  
  def cube(a:Int):Int=
  {
    a*a*a;
  }
  
  def sumCubes(a:Int,b:Int):Int=
  {
    if(a>b) 0 else cube(a)+(sumCubes(a+1, b)) // See last statement is having function as return type
  }
  
}

object HigherOrderFunEx extends App
{
  
  var obj=new HigherOrderFunctionsEx09()
  obj.sumInts(3, 5);
  
  obj.sumCubes(3, 5)
}