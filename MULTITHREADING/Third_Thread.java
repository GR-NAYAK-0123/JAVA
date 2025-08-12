package MULTITHREADING;
import java.lang.Thread;

public class Third_Thread extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();

        for(int i = 1;i<=5;i++){
            System.out.println(name+"("+priority+")"+"has executed run()");
        }
        System.out.println("---------------------------------");
    }
    public static void main(String[] args) {
        Third_Thread obj = new Third_Thread();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("First_thread");
        t2.setName("Second_thread");

        t1.setPriority(10);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}

/*
   Thread Scheduler :
  --------------------
   => It will decide which thread should starts its execution basing upon two things. 
         1) Thread priorities. 
         2) Underlying OS (Hardware apparatus)

    
   Thread priorities :
  ---------------------
   => It is varies between 1 to 10
        Minimum priority - 1
        Average priority - 5
        Maximum priority - 10 
 */
