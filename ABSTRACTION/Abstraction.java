public abstract class Abstraction{
    abstract void meth1();

    abstract String meth1(String s);

    void meth2(){
        System.out.println("meth2() called");
    }

    static void meth3(){
        System.out.println("meth3() called");
    }

    Abstraction(){
        System.out.println("Abstract class constructor calles");
    }
}


class ClassA extends Abstraction{
    void meth1(){
        System.out.println("ClassA method 1 called");
    }
    String meth1(String s){
        System.out.println("ClassA Another meth1() called"+s);
        return s;
    }

    // void meth3(){
    //     System.out.println("Method 3 Overridden"); // We can not override a static method
    // }

    ClassA(){
        System.out.println("ClassA constructor called");
    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.meth1();
        obj.meth1("Raja");
    }

}