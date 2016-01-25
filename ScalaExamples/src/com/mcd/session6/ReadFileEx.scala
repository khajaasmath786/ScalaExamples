package com.mcd.session6

class ReadFileEx {
  
}

object ReadFile extends App
{
  
  val readline=scala.io.Source.fromFile("C:\\Users\\mc41946\\ScalaGit\\ScalaExamples\\src\\com\\mcd\\session6\\Scala.txt").getLines().mkString(" ")
  
  // mksrtring.. see we are splitting with spaces like work count
  
  println(readline)
}