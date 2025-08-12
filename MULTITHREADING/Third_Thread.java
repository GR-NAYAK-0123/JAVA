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
