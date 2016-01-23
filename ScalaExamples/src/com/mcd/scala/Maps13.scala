package com.mcd.scala

object Maps13 extends App {
  val map=Map("Asmath" ->"171878","Khaja" -> "832706");
  
  var mapping=scala.collection.mutable.Map("Asmath" ->"171878","Khaja" -> "832706");
  
  // Get the value from map using get or getOrElse
  
  mapping.get("Asmath");  
  mapping.get("Khaja");
  
  println("Mapping value for key -->"+mapping.getOrElse("Asmath", "Available in Map"));
  println("Mapping value for key -->"+mapping.getOrElse("Khaja", "Available in Map"));
  println("Mapping value for key -->"+mapping.getOrElse("Asmath1", "Not Available in Map"));
  
  // values are added to Map with += and removed with -=
  mapping+=("Mohammed" -> "181818");
    mapping+=("Jameel" -> "181820");
  
  println("Mapping values after adding new key -->"+mapping);
  
  //remvoing element from map
  mapping-=("Jameel");
  println("Mapping values after removing key -->"+mapping);
  
 
  // Yield will result in new collection. creating yield of map so we have to give key and value for yield
  
 var mapYield= for ((k,v) <- mapping) yield (v,k) // yield (k,v) creating map with values as key and keys as values.
  println(mapYield)
  
  
  
  
  
}