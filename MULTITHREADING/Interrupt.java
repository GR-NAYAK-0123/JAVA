/*
   interrupt() :
  ---------------
    => This method will bring back the thread from a sleeping state to it's running state. 
    => If there is no thread in sleeping state then interrupt() will not having any impact on our program.  
 */

package MULTITHREADING;
import java.lang.Thread;

public class Interrupt extends Thread{
    public void run(){
        System.out.println("I am ready for attending the interviews");
        for(int i = 1;i<=5;i++){
            System.out.println("This is my "+i+" interview");
        }
        System.out.println("I got placed Now I cam relax");
        try{
            Thread.sleep(10000);
        } catch(Exception e){
            System.out.println("My sleep got distrubed");
        }
        System.out.println("Time to go to office");
    }
    public static void main(String[] args) {
        Interrupt obj = new Interrupt();
        Thread t1 = new Thread(obj);
        t1.start();
        t1.interrupt();
    }
}
