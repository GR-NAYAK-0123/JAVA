package STATIC;

public class Static_variable {
    int a;  // Instance variable
    static int b;   // static variable

    Static_variable(){
        a++;
        b++;
        System.out.println("Instance variable : "+a);
        System.out.println("Static variable : "+b);
    }
    public static void main(String[] args) {
        new Static_variable();  //1st object
        new Static_variable();  //2nd object
        new Static_variable();  //3rd object
        
    }
}
