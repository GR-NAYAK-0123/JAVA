/*
    Yield() :
   -----------
    => It provides a mechanism to inform the thread scheduler that the current thread is willing to handover it's current use of
       processor but it like to be scheduled as soon as possible. 
    => We cant guess when the yield thread should resume its execution. 
    => If we are using yield method then the selected thread will give a chance for other thread which is having same priority. 
 */

package MULTITHREADING;
import java.lang.Thread;

public class Yield extends Thread{
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println("Run method executed : "+i);
        }
    }
    public static void main(String[] args) {
        Yield obj = new Yield();
        obj.start();
        Thread.yield();

        for(int i = 1;i<=5;i++){
            System.out.println("main() executed : "+i);
        }
    }
}
