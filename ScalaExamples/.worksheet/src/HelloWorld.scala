import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach

object HelloWorld {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(140); 
 val line =Array[String]("This is hello workd","dddf");System.out.println("""line  : Array[String] = """ + $show(line ));$skip(25); ;

  line.foreach(println)}
  
}
