package com.mcd.scala

object Palindrome02 {
  def main(args: Array[String]): Unit = {
    def isPalindrome(text:String):Boolean=
    {
      var reverseString=text.reverse.toString();
      //Last statement in the method is return expression in method. You dont need to mention return
      //It is taken by default.
      text.equalsIgnoreCase(reverseString);
    }
    
    def isPalindromeReturn(text:String):Boolean=
    {
        var reverseString = text.reverse.toString();
        //Last statement in the method is return expression in method. You dont need to mention return
        //It is taken by default.
        if (text.equalsIgnoreCase(reverseString))
          return true;
        else
          return false;
    }
    
     println("Mom "+isPalindrome("Mom"));
     println("Mom "+isPalindrome("Asmath"));
    
  }
  
 
}