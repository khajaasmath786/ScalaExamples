package com.mcd.session5

trait ConcreteLogger3 {
  def log(msg: String) = { println("calling trait concrete logger 3") } // This is concrete method of trait

  // Also traits can have both concrete and abstract methods
}
trait ConsoleLogger3 extends ConcreteLogger3{
  override def log(msg: String) = { println(msg) } // This is concrete method of trait

  // Also traits can have both concrete and abstract methods
}
class Account3 {
  protected var balance = 100000.0;
}
//class SavingsAccount extends ConsoleLogger3 with Account3 // Not Ok ....
class SavingsAccount3 extends Account3 with ConcreteLogger3 {
  def withDrawAmount(amount: Double) = // Use =
    {
      println("Balance before withdraw " + balance)
      println("Withdrawl amount " + amount)
      if (balance.compareTo(amount) > 0) {
        balance = balance - amount;
        log("Total Balance after withdrawing amount " + balance)
      } else {
        log("You dont have sufficient funds to withdraw")
      }
    }
}
object TraitConcreteEx3 extends App // Make sure you have app here or main method. I saw this issue where you cannot see run as scala application.
{
  var traitObj = new SavingsAccount3();
  traitObj.withDrawAmount(30.0);
  
  var traitObjwithOtherTrait = new SavingsAccount3() with ConsoleLogger3;
  traitObj.withDrawAmount(30.0);

  //traitObj.log("calling methods of traits"); --> This method calls method inside trait.
}