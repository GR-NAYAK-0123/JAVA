/*
      Method Over-Loading :
    -------------------------
       => Writting two or more methods in same class having same method name but different parameters. 
       => It is also known as "early binding" or "Compile time polymorphism"
       => Methods calls are resolved at compile time. 
       => Must have different arguments lists. 
 */

package POLYMORPHISM;

public class MethodOverLoading {
    public void meth1(){
        System.out.println(10);
    }
    void meth1(int a){
        System.out.println(20);
    }
    static final int meth1(int a, int b){
        System.out.println(30);
        return 10;
    }
    static String meth1(String s){
        System.out.println(40);
        return s;
    }
    final protected String meth1(int a, String s){
        System.out.println(50);
        return s;
    }
    static StringBuilder meth1(StringBuilder s){
        System.out.println(60);
        return s;
    }
    public static void main(String[] args) {
        MethodOverLoading obj=new MethodOverLoading();
        obj.meth1();
        System.out.println(MethodOverLoading.meth1(new StringBuilder("Raja")));
    }
}
