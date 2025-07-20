
public class Program_01 {
    Program_01(){
        new Program_01(100).meth2();
        System.out.println("I am from Non-parameterized constructor");
    }
    Program_01(int a){
        System.out.println("Parameterized constructor");
        new Program_01(99, 1).meth3();
    }
    Program_01(int a, int b){
        System.out.println("Addition : "+(a+b));
    }
    void meth1(){
        System.out.println("meth1() called");
    }
    void meth2(){
        System.out.println("meth2() called");
    }
    void meth3(){
        System.out.println("meth3() called");
    }
    public static void main(String[] args) {
        System.out.println("Start");
        Program_01 aobj=new Program_01();
        aobj.meth1();
        System.out.println("End");
    }
}