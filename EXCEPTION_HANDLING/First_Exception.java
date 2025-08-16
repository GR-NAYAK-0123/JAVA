package EXCEPTION_HANDLING;

import java.util.Scanner;

public class First_Exception {
    void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.println(10);

        try{
            System.out.println("try block executed");
            System.out.println("Please enter a number");
            System.out.println("===>"+20/sc.nextInt());
        }
        catch(ArithmeticException e){
            System.out.println("catch block executed");
        }
        finally{
            System.out.println("Finally block executed");
            sc.close();
        }

        System.out.println(30);
    }
    public static void main(String[] args) {
        First_Exception obj = new First_Exception();
        obj.meth1();
    }
}
