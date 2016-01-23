package com.mcd.scala

object Functions09 {
  def main(args: Array[String]): Unit = {

    def factorial(number: Int): Int =
      {
        if (number == 0) 1;
        else {
          number * factorial(number - 1);

        }
      }
    println("--------- Recursive functions must specify return type -------------"+factorial(2))
    println("--------- Recursive functions must specify return type -------------"+factorial(0))

    def area(radius: Int): Double =
      {
        3.14 * radius * radius;
      }

    // 
    val areavalue = area(5);
    println("Area " + areavalue)

    def areaWithoutReturn(radius: Int): Double =
      {
        3.14 * radius * radius;
      }

    val areawithoutReturn = areaWithoutReturn(5);
    println("Area --> " + areawithoutReturn)
  }
  
  
  def concatStringWithDefaults(firstName:String,middleName:String="Mr",lastName:String="Mohammed")=
  {
   firstName+middleName+lastName;
  }

  println(concatStringWithDefaults("Khaja")) // Be cautioous with defaults and always use from  the end for defaults in function signature.
}