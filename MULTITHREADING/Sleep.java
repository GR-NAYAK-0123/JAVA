/*
    Sleep() :
   -----------
    => This method will pause the running thread for a given amount of time. 
    => Sleep timings of a thread are not guaranted to be precise because they are highly system dependent. 
 */

package MULTITHREADING;
import java.lang.Thread;

public class Sleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("J");
        Thread.sleep(3000);
        System.out.println("A");
        Thread.sleep(3000);
        System.out.println("V");
        Thread.sleep(3000);
        System.out.println("A");
    }
}
