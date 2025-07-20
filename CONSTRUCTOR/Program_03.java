/*
   Q) Write a program to print the name of a student by creating any ClassName. If nothing is passed white creating an object just
      print "Unknown", Otherwise the name should be printed which is passed while creating an object of the class.

 */

public class Program_03 {
    Program_03(){
        System.out.println("Unknown");
    }
    Program_03(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        new Program_03();
        new Program_03("Raja Nayak");
    }
}
