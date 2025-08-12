/*
    What is a Thread :
   --------------------
   => We can create a thread inside a process. 
   => Process act as the host for a thread. 
   => Atleast one process is required to create a thread. 
   => Thread shares same memory address. 
   => Context switching is easy in threads. 

   How to create a Thread ?
  --------------------------
   => We can create a thread in any one of the below mentioned ways
       1) By implementing Runnable interface
       2) By extending Thread class

    Note :
   -------
    => Whenever we are starting a thread with the help of start(), every thread by default it will execute run(). 

    Steps for creating a thread :
   -------------------------------
    => Write a class that extends Thread class or implements Runnable interface this is available in java.lang package. 
    => Write public void run() method in that class, this is the method by default executed by any method. 
    => Create an object to that class. (Inside the main method)
    => Create a thread and attach it to the object. 
    => Start running the thread. 
    
 */

package MULTITHREADING;
import java.lang.Thread;

public class Thread1 extends Thread {
    public void run(){
        System.out.println("Run method called");
    }
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        Thread t1=new Thread(obj);
        t1.start();
        //obj.start();
    }
}
