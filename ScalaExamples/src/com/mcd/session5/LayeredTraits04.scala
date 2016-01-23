package com.mcd.session5
trait Logger4 {
  def log(msg: String) = {} // This is concrete method of trait
  // Also traits can have both concrete and abstract methods
}
trait ConsoleLogger4 extends Logger4 {
  override def log(msg: String) = {
    println(msg)
  }
}
trait TimestampLogger4 extends Logger4 {
  override def log(msg: String) = {
    super.log(new java.util.Date() + " " + msg)
  } // This is concrete method of trait
}
trait ShortLogger4 extends Logger4 {
  var maxLength:Int = 17;
  override def log(msg: String) = { 
    super.log(if(msg.length()<=maxLength) msg else msg.substring(0,maxLength-3) + "........") }
}
class Account4 {
  protected var balance = 100000.0;
}
//class SavingsAccount extends ConsoleLogger4 with Account4 // Not Ok ....
class SavingsAccount4 extends Account4 with Logger4 {
  def withDrawAmount(amount: Double) = // Use =
    {
      /*println("Balance before withdraw " + balance)
      println("Withdrawl amount " + amount)*/
      if (balance.compareTo(amount) > 0) {
        balance = balance - amount;
        log("Total Balance after withdrawing amount " + balance)
      } else {
        log("You dont have sufficient funds to withdraw")
      }
    }
}
object TraitConcreteEx4 extends App // Make sure you have app here or main method. I saw this issue where you cannot see run as scala application.
{
 var acct1= new SavingsAccount4 with ConsoleLogger4 with TimestampLogger4 with ShortLogger4
 acct1.withDrawAmount(40)
  var acct2= new SavingsAccount4 with ConsoleLogger4 with ShortLogger4 with TimestampLogger4 
 acct2.withDrawAmount(67) 
}