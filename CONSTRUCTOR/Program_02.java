/*
  Problem statement :
     Create a class named "Program_02" while creating an object of the class, if nothing is passed to it then the message
     "I Love Programming languages" should be printed. If some string is passed to it then the place of "programming language"
     the name of that string variable should be printed. For example while creating an object if we passed "java" then
     "I love java" should be printed

 */

public class Program_02 {
    Program_02(){
        System.out.println("I Love Programming Languages");
    }
    Program_02(String s){
        System.out.println("I Love "+s);
    }
    public static void main(String[] args) {
        new Program_02();   // No value is passed
        new Program_02("Spring Framework");  // value is passed
    }
}
