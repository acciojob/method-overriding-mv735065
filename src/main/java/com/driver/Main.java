package com.driver;

class A{
  public String meth(){
    return "Invoking method from class A";

  }
}

class B extends A{
   B obj = new B();
  obj.meth();

   public String meth(){
    return "Invoking method from class B";

  }

  obj.meth();
    

}

public class Main {
 
}
