/*
     Hierarchial Inheritance :
    ---------------------------
       => One parent class having multiple child class. 
 */

package OOPS.INHERITANCE;

public class Hierarchial_Inheritance {
    public void meth1(){
        System.out.println("Parent class method called");
    }
}


class ClassC extends Hierarchial_Inheritance {
    public static void main(String[] args) {
        new ClassC().meth1();
    }
}

class ClassD extends Hierarchial_Inheritance {
    public static void main(String[] args) {
        new ClassD().meth1();
    }
}