/*
    Daemon Thread :
   ----------------
    => Daemon thread are threads with infinite loop which would supporting the parent thread as a background process and it is
       supposed to get executed along eith the parent thread. Also this background thread should stop when the parent thread stop

 */

package MULTITHREADING;

import java.lang.Thread;

public class Daemon extends Thread{
    public void run(){
        for(int i = 1; ;i++){
            System.out.println("Daemon : "+i);
        }
    }
    public static void main(String[] args) {
        Daemon obj = new Daemon();

        Thread t1 = new Thread(obj);
        
        t1.setDaemon(true);
        t1.start();

        for(int i = 0;i<=10;i++){
            System.out.println("main : "+i);
        }
        System.out.println("End of main method");
        
    }
}
