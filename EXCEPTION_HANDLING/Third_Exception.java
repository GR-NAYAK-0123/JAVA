package EXCEPTION_HANDLING;

import java.util.Scanner;

public class Third_Exception {
    void meth1(){
        Scanner sc = new Scanner(System.in);

        //String s = null;

        System.out.println(10);

        try{
            System.out.println("Try block executed");
            System.out.println("Please enter a number");
            System.out.println(20/sc.nextInt());
            //System.out.println("length : "+s.length());
            System.out.println("Hello");
        }
        catch(ArithmeticException | NullPointerException eobj){
            System.out.println("1st catch block executed");
            eobj.printStackTrace();
        }
        // catch(NullPointerException e){
        //     System.out.println("2nd catch block executed");
        // }
        finally{
            System.out.println("finally block executed");
        }
        System.out.println(30);
        sc.close();
    }
    public static void main(String[] args) {
        new Third_Exception().meth1();
    }
}
