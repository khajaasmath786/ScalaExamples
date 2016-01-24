package com.mcd.session5


trait Logger6
{
  def log(msg:String)
  def info(msg:String){log("Info-->"+msg)}
  def warn(msg:String){log("Warn-->"+msg)}
  def fatal(msg:String){log("Fatal-->"+msg)}
  def error(msg:String){log("Error-->"+msg)}
  
}
class Account6 {
  protected var balance = 100000.0;
}

class SavingsAccount6 extends Account6 with Logger6 { // class should be asbtract as there is log method of abstract. you overrided that in this class to overcome it. Design aspect
  def withDrawAmount(amount: Double) = // Use =
    {
      /*println("Balance before withdraw " + balance)
      println("Withdrawl amount " + amount)*/
      if (balance.compareTo(amount) > 0) {
        balance = balance - amount;
        info(" Total Balance after withdrawing amount " + balance)
      } else {
        error("You dont have sufficient funds to withdraw")
      }
    }
  override def log(msg:String)=
  {
    println("Calling method after overriding--> "+msg)
  }
}


object RichTraitEx extends App
{
  val obj=new SavingsAccount6();
  obj.withDrawAmount(17.0)
}