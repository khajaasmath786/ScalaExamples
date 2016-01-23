package com.mcd.session2

class CompanionObjectApply07( var id: Int, initialBalance: Double) {
  //Since it is a companion object name of class and object should be same
  var balance = initialBalance;
  def deposit(amount: Double) {
    balance += amount;
  }

  def description = "Account" + id + " with balance " + balance;

}

object CompanionObjectApply07 //Since it is a companion object name of class and object should be same
{
  def apply(initialBalance: Double) =
    {
      new CompanionObjectApply07(uniqueNumberCounter(), initialBalance);
    }
  var lastNumber = 0;
  def uniqueNumberCounter() = {
    lastNumber = lastNumber + 1;
    lastNumber;
  }

}


class CompanionObjectApplyPrivate07( private var id: Int, initialBalance: Double) {
  //Since it is a companion object name of class and object should be same
  private var balance = initialBalance;
  def deposit(amount: Double) {
    balance += amount;
  }

  def description = "Account" + id + " with balance " + balance;

}

object CompanionObjectApplyPrivate07 //Since it is a companion object name of class and object should be same
{
  def apply(initialBalance: Double) =
    {
      new CompanionObjectApply07(uniqueNumberCounter(), initialBalance);
    }
  var lastNumber = 0;
  def uniqueNumberCounter() = {
    lastNumber = lastNumber + 1;
    lastNumber;
  }

}

object CompanionObjectApplyApp extends App {
  val acct = CompanionObjectApply07(1006.23); // This is equal to CompanionObjectApply07.apply .. it is the first method that is called in companion object
  val acctPrivate=CompanionObjectApplyPrivate07(1007.23) // This is calling private constructor. since companion object and its class can access their methods and variables , private variables and constrcutor is visible to it.
  
}


