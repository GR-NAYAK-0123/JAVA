package EXCEPTION_HANDLING;

public class Second_Exception {
    void meth1(){
        System.out.println(10);

        try{
            System.out.println("try block executed");
            System.out.println(20/0);
        }
        catch(Exception e){
            System.out.println("catch block executed");
            //System.out.println(e.getMessage()); // Reason of the exception
            //System.out.println(e.toString()); // Reason and name of the exception
            e.printStackTrace(); // It gives complete information about the exception
        }
        finally{
            System.out.println("Finally block executed");
        }

        System.out.println(30);
    }
    public static void main(String[] args) {
        Second_Exception obj = new Second_Exception();
        obj.meth1();
    }
}
