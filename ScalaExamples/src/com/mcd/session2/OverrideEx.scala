package com.mcd.session2

class OverrideEx {
  
  var name="";
  
  override def toString = getClass.getName+" name "+name
}

class OverrideSub extends OverrideEx
{
  
  var salary="";
  
  override def toString = super.toString()+" salary "+ salary ;
  //since you are invoking super class method to get variable name , you need to use super
  //override def toString = " name "+name +"Salary "+salary;// Not Ok..
  
}

object overideExobj extends App
{
  val overrideSub =new OverrideSub
  
  overrideSub.name="Asmath";
  overrideSub.salary="12000";
  println(overrideSub)
  println(overrideSub.toString())
  
}
  