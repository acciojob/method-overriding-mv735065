package com.driver;

class A{
  public String meth(){
    return "Invoking method from class A";

  }
}

class B extends A{


   public String meth(){
    return "Invoking method from class B";

  }
    

}

public class Main {
 public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());  // 3rd task
   
        System.out.println(obj.meth());  // 5 task
  
  
}
}
