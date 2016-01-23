import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach

object HelloWorld {
 val line =Array[String]("This is hello workd","dddf");
                                                  //> line  : Array[String] = Array(This is hello workd, dddf)

  line.foreach(println)                           //> This is hello workd
                                                  //| dddf
  
}