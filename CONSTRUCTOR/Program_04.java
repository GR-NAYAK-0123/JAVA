/*

   Problem statement :
        Suppose you have a bank account with an initial amount of 500 and you have to add some more amount to it. Create a class 
        with any name and with a data member named "amount" with an initial value of 500. Now make two constructor of this class
        as follows
           1) Without any parameter no amount will be added then just display without updating.
           2) Having a parameter which is the amount that will be added to the account and display the final amount.
  
 */

public class Program_04 {
    static float amount = 500;
    Program_04(){
        System.out.println("No amount will be added");
        System.out.println(amount);
    }
    Program_04(int value){
        amount = (amount + value);
        System.out.println("The account balance : "+(amount));
    }
    public static void main(String[] args) {
        new Program_04();
        new Program_04(300);
        new Program_04();
    }
}
