/*
   Join() :
  ----------
   => This join() allows to wait the current executing thread for completion of another thread. 
   => Every join() throws InterruptedException, hence compulsory we should handle by using try catch block or by using throws
      keyword otherwise we will be getting compile time error. 

 */


package MULTITHREADING;
import java.lang.Thread;

public class Join extends Thread{
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println("run() executed : "+i);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Join obj = new Join();
        obj.start();
        obj.join();

        for(int i = 1;i<=5;i++){
            System.out.println("Join class executed "+i);
        }
    }
}

// class ClassA {
//     public static void main(String[] args) throws InterruptedException{
//         Join obj=new Join();
//         obj.start();
//         obj.join();


//         for(int i = 1;i<=5;i++){
//             System.out.println("Present class executed "+i);
//         }

//     }
// }
