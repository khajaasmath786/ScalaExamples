package com.mcd.session5
// I gave package name as 9 but it was not throwing error. so I was not able to see this as scala application

trait Logger9 {
  def log(msg: String) = {} // This is concrete method of trait
  // Also traits can have both concrete and abstract methods
}

// This example illustrates abstract fields in Traits. The fields are available to underlying class( no need of inheritance as methods in traits since they are field not methods).
// if you dont initialize filed then it is abstract by default.var maxLength:Int; Add abstract keyword and see. In scala it is bit different
//Value of that variable in initalized during object creation and then passed to traits like with Traits {  var maxLength=17}
trait ConsoleLogger9 extends Logger9 {
  override def log(msg: String) = {
    println(msg)
  }
}

trait ShortLogger9 extends Logger9 {
  val maxLength:Int; //abstract field
  override def log(msg: String) = { 
    super.log(if(msg.length()<=maxLength) msg else msg.substring(0,maxLength-3) + "........") }
}
class Account9 {
  protected var balance = 100000.0;
}
//class SavingsAccount extends ConsoleLogger9 with Account9 // Not Ok ....
class SavingsAccount9 extends Account9 with Logger9 {
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
object TraitConcreteEx9 extends App // Make sure you have app here or main method. I saw this issue where you cannot see run as scala application.
{
 val acct2= new SavingsAccount9 with ConsoleLogger9 with ShortLogger9 {   val maxLength=17   }
 acct2.withDrawAmount(90)
  
}