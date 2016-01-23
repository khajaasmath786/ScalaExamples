package com.mcd.scala

object PalindromeWithAPP02 extends App {
  
  // If you do as APP then there is no need to write main method in scala.
  
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
    
     println("Mom from Palindrome APP "+isPalindrome("Mom"));
     println("Mom "+isPalindrome("Asmath"));
}