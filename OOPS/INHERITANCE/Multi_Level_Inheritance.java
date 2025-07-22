/*
      Multi-Level Inheritance :
    -----------------------------
       => The child class object can access both parent and grand parent class methods. 
 */

package OOPS.INHERITANCE;

public class Multi_Level_Inheritance {
    public void meth1(){
        System.out.println("Grand parent class meth1() called");
    }
}

class ClassA extends Multi_Level_Inheritance {
    public void meth2(){
        System.out.println("Parent class meth2() called");
    }
}

class ClassB extends ClassA {
    public static void main(String[] args) {
        ClassB obj=new ClassB();
        obj.meth1();
        obj.meth2();
    }
}
