package MULTITHREADING;

import java.lang.Thread;

public class Synchronization_block extends Thread{
    public void run(){

        String name = Thread.currentThread().getName();

        synchronized(this){
            System.out.println(name+" has entered the critical resources");
            for(int i = 1;i<=5;i++){
                System.out.println(name+" value of i : "+i);
            }
        }
         System.out.println(name+" has completed it's execution");

         for(int i = 10;i<=15;i++){
            System.out.println(name+ " x value is : "+i);
         }
    }
    public static void main(String[] args) {
        Synchronization_block obj = new Synchronization_block();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.start();
        t2.start();
    }
}
