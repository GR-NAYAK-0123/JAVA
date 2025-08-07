package THIS_KEYWORD;

public class This {
    void meth1(){
        //this(); // C.E because we can't use this() anywhere except inside a constructor
        System.out.println("meth1() called");
        // new This();
    }
    This(){
        this("Java is awesome");
        System.out.println("Default constructor");

    }
    This(int a){
        this();
        System.out.println("Parameterized constructor : "+a);
        // new This();
        // this(); // C.E because this() should be the 1st statement inside a constructor
    }
    This(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        new This(10).meth1();
    }
}

