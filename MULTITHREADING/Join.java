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
