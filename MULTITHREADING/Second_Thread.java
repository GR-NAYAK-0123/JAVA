package MULTITHREADING;
import java.lang.Thread;

public class Second_Thread implements Runnable{
    public void run(){
        for(int i = 0;i<=5 ;i++){
            System.out.println("Run executed : "+i);
        }
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
        Second_Thread obj = new Second_Thread();
        Thread t1=new Thread(obj);
        Thread t2 = new Thread();

        t1.start(); // A new thread will be created and that thread is responsible for running the run() which is present in Second_Thread class
        
        t1.run();  //No new thread will be created, we are directly calling run() which is present in Thread class but Second_Thread run() will be getting executed because of overridding. 
        
        t2.start(); // A new thread will be created and it will execute the run() which is present in Thread class. 

        t2.run(); // No new thread will be created, we are directly calling run() which is present in Thread class. 
    }
}
