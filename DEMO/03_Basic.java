/*
       Q) How to pass value for the parameter which is present in a method ?
       Ans) We need pass the value for the parameter whenever we are calling that method
 */

package DEMO;

class ClassA {
    void meth1(int a, int b){
        System.out.println("meth1() called");
        System.out.println(a);
    }
    int meth2(){
        System.out.println("meth2() called");
        return 100;
    }
    int meth3(int a, int b, int c){
        System.out.println("meth3() called");
        return a+b+c;
    }
    public static void main(String[] args) {
        System.err.println("Start");
        ClassA aobj = new ClassA();
        aobj.meth1(10, 20);
        int result = aobj.meth2();
        System.out.println("result : "+result);
        System.out.println("------------------------------");
        System.out.println("Value is : "+aobj.meth3(5,7,8));
        System.out.println("End");
    }
}
