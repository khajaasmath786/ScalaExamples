package com.mcd.session5

package com.mcd.session5
trait Logger5 {
  def log(msg: String) // This is sbstract method of trait. You should use abstract keyword when extending it and using with layered traits. If not then simply override is fine
  
  
}
trait ConsoleLogger5 extends Logger5 {
  override def log(msg: String) = {
    println(msg)
  }
}
trait TimestampLogger5 extends Logger5 {
  abstract override def log(msg: String) = {  // Remove asbtract here and see
    super.log(new java.util.Date() + " " + msg)
  } // This is concrete method of trait
}

class Account5 {
  protected var balance = 100000.0;
}
//class SavingsAccount extends ConsoleLogger5 with Account5 // Not Ok ....
abstract class SavingsAccount5 extends Account5 with Logger5 { //Remove abstract here and see what you get
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
object TraitConcreteEx5 extends App // Make sure you have app here or main method. I saw this issue where you cannot see run as scala application.
{
 var acct1= new SavingsAccount5 with ConsoleLogger5 with TimestampLogger5 
 acct1.withDrawAmount(50)
  var acct2= new SavingsAccount5 with ConsoleLogger5 with TimestampLogger5 
 acct2.withDrawAmount(67) 
}