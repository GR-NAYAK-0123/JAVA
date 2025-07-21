package STATIC;

public class Static_block {
    static int a = Static_block.meth1();
    static int b = Static_block.meth2();

    static int meth1(){
        System.out.println("Static meth1() called");
        return 100;
    }

    static int meth2(){
        System.out.println("Static meth2() called");
        return 200;
    }

    static {
        System.out.println("1st static block executed "+a);
    }

    public static void main(String[] args) {
        System.out.println("main() called "+(a+b));
    }

    static {
        System.out.println("2nd static block executed "+b);
    }
}
