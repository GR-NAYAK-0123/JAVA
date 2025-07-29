package POLYMORPHISM;

public class MethodOverridding {
    void meth1(){
        System.out.println("Parent class meth1()");
    }
    public void meth2(int a){
        System.out.println("Parent class meth2() : "+a);
    }
    MethodOverridding meth3(){
        System.out.println("Parent class meth3()");
        return new MethodOverridding();
    }
    static void meth4(){
        System.out.println("Parent class static method");
    }
}

class ClassB extends MethodOverridding {
    void meth1(){
        System.out.println("Child class meth1()");
    }
    public void meth2(int a){
        System.out.println("Child class meth2() : "+a);
    }
    ClassB meth3(){
        System.out.println("Child class meth3()");
        return new ClassB();
    }
    static void meth4(){
        System.out.println("Child class static method");
    }
    public static void main(String[] args) {
        MethodOverridding obj=new ClassB();
        ClassB obj2 = new ClassB();
        obj2.meth1();
        obj2.meth2(20);
        obj2.meth3();
        ClassB.meth4();
        System.out.println("---------------------------------------");
        obj.meth1();
        obj.meth2(10);
        obj.meth3();
        MethodOverridding.meth4();
    }

}