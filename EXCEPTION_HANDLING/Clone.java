package EXCEPTION_HANDLING;

class ClassA{
    int a;
    int b;
}

class ClassB implements Cloneable{
    int x;
    int y;

    ClassB shows() throws CloneNotSupportedException {
        ClassB obj = (ClassB) super.clone();
        return obj;
    }
}

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException{
        System.out.println("Implementing clone() : ");
        ClassA aobj1 = new ClassA();

        aobj1.a = 10;
        aobj1.b = 20;

        System.out.println(aobj1.a +" "+ aobj1.b);

        ClassA aobj2 = aobj1;
        aobj2.b = 200;

        System.out.println(aobj1.a+" "+aobj1.b+" "+aobj2.b);

        ClassB bobj1 = new ClassB();
        bobj1.x = 100;
        bobj1.y = 200;

        System.out.println(bobj1.x+" "+bobj1.y);

        ClassB bobj2 =  bobj1.shows(); //The clone method will clone the object which you used to call that method. 
        bobj2.y = 999;

        System.out.println(bobj1.x+" "+bobj1.y+" "+bobj2.x+" "+bobj2.y);

        ClassB bobj3 = new ClassB();
        bobj3.y = 888;

        System.out.println(bobj1.x+" "+bobj1.y+" "+bobj3.x+" "+bobj3.y);

    }
}
