
/*
     Single Inheritance :
    ------------------------
        => One level of inheritance [There is having one parent class and one child class]

 */

package OOPS.INHERITANCE;

public class Single_Inheritance {
    void meth1(){
        System.out.println("Parent Class meth1() called");
    }
}


class Child extends Single_Inheritance {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.meth1();
    }
}
