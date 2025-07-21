package STATIC;

public class Static_method {
    int a = 10;
    static int b = 20;

    void meth1(){
        System.out.println("Normal method");
        System.out.println("Instatnce variable a : "+a);
        System.out.println("Static variable b : "+b);
    }
    static void meth2(){
        System.out.println("Static method");
        System.out.println("Instatnce variable a : "+ new Static_method().a);
        System.out.println("Static variable b : "+b);
    }
    public static void main(String[] args) {
         Static_method obj=new Static_method();
         obj.meth1();
         // obj.meth2();  //It is correct but not recommended
         meth2();
         Static_method.meth2();
    }
}
