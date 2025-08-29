package COLLECTION_FRAMEWORK;

import java.util.Iterator;
import java.util.LinkedList;

class ClassB{
    int a;
    int b;
    int c;

    public ClassB(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString(){
        return "[a = "+a+", b = "+b+", c = "+c+"]";
    }
}

public class LinkedList_2 {
    void meth1(){
        System.out.println("Inserting an userdefined class object into the LinkedList\n");
        LinkedList<ClassB> ll = new LinkedList<ClassB>();

        ClassB bobj1 = new ClassB(5, 6, 7);
        ClassB bobj2 = new ClassB(1, 2, 3);

        ll.add(bobj1);
        ll.add(bobj2);
        ll.add(new ClassB(5, 6, 7));

        System.out.println(ll);

        Iterator<ClassB> i = ll.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new LinkedList_2().meth1();
    }
}
