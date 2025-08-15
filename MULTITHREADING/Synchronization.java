/*
    Synchronization :
   -------------------
    => Synchronization in java controls multiple threads accessing the same shared resources in order to prevent an inconsistent
       state. 
    => In simple it is a process of making only one thread can access a resource where multiple threads are trying to access
       the same resources and moving all the remaining threads into waiting state. 
    => We can achieve synchronization  in two ways. 
             a) Synchronized method. 
             b) Synchronized block. 
    => The main drawback of synchronization is it increases thread waiting time.  
    => thread.join() stops the execution of current thread and allow the another thread should complete it's execution. 
    => Synchronization prevents multiple threads from executing the synchronized part of code on the same instance. 
 */

package MULTITHREADING;

import java.lang.Thread;

public class Synchronization extends Thread{

    public void run(){
        criticalResources();
    }

    synchronized void criticalResources(){
        String name = Thread.currentThread().getName();
        System.out.println(name+ " has entered into criticalResources");
        for(int i = 1;i<=5;i++){
            System.out.println(name+" value is : "+i);
        }
        System.out.println(name + " has complete it's execution");
    }
    public static void main(String[] args) {
        Synchronization obj = new Synchronization();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("First_Thread");
        t2.setName("Second_Thread");

        t1.start();
        t2.start();
    }
}
