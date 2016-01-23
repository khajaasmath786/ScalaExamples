package com.mcd.session2

class AccessorMutatorEx {
  var size=1;
  
 
}
 object AccessorandMutator extends App
  {
    var obj =new AccessorMutatorEx();
    println("Calling mutator method with =")
    obj.size=20; // or obj.size_=(20)
    
     println("Calling accessor method without =    "+obj.size)
    
  }