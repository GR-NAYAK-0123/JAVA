package GARBAGE_COLLECTION;

public class Garbage_Collection {
    void meth1(){
        System.out.println("meth1() called");
        new Garbage_Collection();
    }

    // @Override
    // protected void finalize(){
    //     System.out.println("Garbage has been collected");
    // }

    public static void main(String[] args) {
        Garbage_Collection obj1 = new Garbage_Collection();
        Garbage_Collection obj2 = new Garbage_Collection();

        obj1.meth1();
        obj2.meth1();

        obj2 = obj1; // Here we re-assigning obj1 to obj2
        obj1 = null; // Here we are nullifying the reference variable

        //obj2.meth1(); // Here we are getting null pointer exception

        System.gc(); // Here we are calling garbage collector manually

    }
}
