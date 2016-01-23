package com.mcd.scala
import scala.collection.mutable;
import scala.collection.mutable.ArrayBuffer
object ArrayBuffer12 {
  def main(args: Array[String]): Unit = {
    
    var arrBuffer= ArrayBuffer[Int]();
    
    // add elememts to array buffer with +=
    
    
    arrBuffer+=1413;
    println("Adding single element to array buffer with operator +=   "+arrBuffer)
    
    arrBuffer+=(1314,171878,832707);
    println("Adding Multiple elements to array buffer with operator +=   "+arrBuffer)
    
    arrBuffer++=Array(24,32,56,34,56,78,99);
    println("Adding Multiple elements to array buffer with operator ++=   "+arrBuffer)
    
    println("----------------------------------")
    println("Retreving all elememts in an arraybuffer")
    for(allElem <- arrBuffer)
    {
      println(allElem)
    }
    
    println("----------------------------------")
    println("Remove last 2 elememts in an arraybuffer")    
    arrBuffer.trimEnd(2);
    for(allElem <- arrBuffer)
    {
      println(allElem)
    }
  
    println("----------------------------------")
    println("Remove first 2 elememts in an arraybuffer")    
    arrBuffer.trimStart(2);
    for(allElem <- arrBuffer)
    {
      println(allElem)
    }
    
    println("----------------------------------")
    println("insert element at index 2 on arraybuffer")    
    arrBuffer.insert(2, 100);
    for(allElem <- arrBuffer)
    {
      println(allElem)
    }
    
    println("----------------------------------")
    println("Add list to array buffer(Note: this is adding at position 3 but not at end. see explanation by giving . after insert)")    
    arrBuffer.insert(3,101,230,405,101);
    for(allElem <- arrBuffer)
    {
      println(allElem)
    }
    
    println("----------------------------------")
    println("Removes elememt from the array list at that index not the value")    
    arrBuffer.remove(3);
    for(allElem <- arrBuffer)
    {
      println(allElem)
    }
    
     println("----------------------------------")
    println("Removes elememt from the array list at that index and 2 elements in this case. ")    
    arrBuffer.remove(3,2);
    for(allElem <- arrBuffer)
    {
      println(allElem)
    }
    
  }
}