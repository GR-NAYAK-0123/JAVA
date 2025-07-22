package OOPS.INHERITANCE;

public class Hybrid_Inheritance {
    public void meth1(){
        System.out.println("Parent class meth1() called");
    }
}

class ClassE extends Hybrid_Inheritance {
   public void meth2(){
       System.out.println("Parent class meth2() called");
   }
}

class ClassF extends Hybrid_Inheritance {
    public void meth3(){
        System.out.println("meth3() called");
    }
}

class ClassG extends ClassE {
    public static void main(String []args){
        new ClassF().meth1();
    }
}
