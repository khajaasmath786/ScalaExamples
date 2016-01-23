package com.mcd.session2

package scala {
  package examples {
    package pack1 {
      class pack1ex(id: Int) {
        def desc = "Package 1 with " + id;
      }
    }
  }
}
// In scala, we can have multiple packages in same source file. I am declaring one more package in different source file . In this case packages08 file of com.packages.ex . additional packages insie that source file

package java {
  package examples {
    package pack2 {
      class pack2ex(id: Int) {
        def desc = "Package 2 with " + id;
      }
    }
  }
}

object PackagesExample extends App
{
  var pack1=new com.mcd.session2.scala.examples.pack1.pack1ex(10);
  var pack2=new com.mcd.session2.java.examples.pack2.pack2ex(20);
  var pack3=new com.packages.ex.hadoop.examples.pack3.pack3ex(30);
  
  println("Pack 1 is called from this source file "+pack1.desc)
  println("Pack 2 is called from this source file "+pack2.desc)
  println("*****Pack 3 is called from different source file with different package ***** "+pack3.desc)
}