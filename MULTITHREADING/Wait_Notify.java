package MULTITHREADING;

public class Wait_Notify {
    int amount = 10000;

    synchronized void with_draw(int amount) throws InterruptedException {
        if(this.amount < amount){
            System.out.println("Insufficient balance");
            wait();
            System.out.println("Amount credited");
            this.amount -= amount;
            System.out.println("Withdraw successfully \n Balance is : "+this.amount);

        } else {
            this.amount -= amount;
            System.out.println("Withdraw successfully \n Balance is : "+this.amount);
        }
    }
    synchronized void deposit(int amount){
        this.amount += amount;
        System.out.println("Deposit successfully \n Balance is : "+this.amount);
        notify();
    }
}


class Withdraw {
    public static void main(String[] args) {
        Wait_Notify obj = new Wait_Notify();

        new Thread() {    // Anonymous Inner class starts here
            public void run(){
                try{
                    obj.with_draw(15000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }.start();   // Anonymous Inner class ends here

        new Thread() {     // Anonymous Inner class starts here
            public void run(){
                obj.deposit(10000);
            }
        }.start();   // Anonymous Inner class ends here
    } 
}


/*
    Wait() :
   ---------
    => It is present in the object class. 
    => It is a non static method. 
    => Three versions of wait() are there -> wait() , wait(millisec), wait(millisec, nanosec). 
    => We need to use wait() only inside a synchronized context. 

    Sleep() :
   -----------
    => It is present in Thread class. 
    => It is a static method. 
    => There are two versions of sleep() are there -> sleep(millisec), sleep(millisec, nanosec). 
    => We can use sleep() in both inside a synchronized context and outside also. 
 */