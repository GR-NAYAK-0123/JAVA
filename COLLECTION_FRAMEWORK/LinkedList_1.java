package COLLECTION_FRAMEWORK;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_1 {
    void meth1(){
        System.out.println("Implementing LinkedList\n");

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);    //Insertion order is maintained
        //ll.add("java"); // Heterogeneous data is not allowed if you are using a specific generic
        ll.add(null);  // Null is allowed
        ll.add(20);    // It is available from java 1.2v
        ll.add(30);     // It's default size is 0 [It increases by double]
        ll.add(40);    // It is not synchronized
        ll.add(50);
        ll.add(60);
        ll.add(10);

        System.out.println(ll);
        System.out.println("-----------------------");
        ListIterator<Integer> li = ll.listIterator();
        while(li.hasNext()){
            System.out.print(li.next()+" ");
        }
        System.out.println();
        while(li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new LinkedList_1().meth1();
    }
}

// In linkedList data will be stored in the form of nodes