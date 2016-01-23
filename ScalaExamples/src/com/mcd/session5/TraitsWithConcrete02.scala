package com.mcd.session5

trait ConsoleLogger2
{
  def log (msg:String) ={println(msg)}// This is concrete method of trait
  
  // Also traits can have both concrete and abstract methods
}

class Account2
{
  protected var balance =100000.0;
}

//class SavingsAccount extends ConsoleLogger2 with Account2 // Not Ok ....
class SavingsAccount extends Account2 with ConsoleLogger2
{
  def withDrawAmount(amount:Double)= // Use =
  {
    println("Balance before withdraw "+balance)
    println("Withdrawl amount "+amount)
    if (balance.compareTo(amount)>0)
    {
      balance =balance-amount;
      log("Total Balance after withdrawing amount "+balance)
    }else
    {
      log("You dont have sufficient funds to withdraw")
    }
  }
}

object TraitConcreteEx extends App  // Make sure you have app here or main method. I saw this issue where you cannot see run as scala application.
{
  var traitObj=new SavingsAccount();
  traitObj.withDrawAmount(20.0);
  
  //traitObj.log("calling methods of traits"); --> This method calls method inside trait.
}