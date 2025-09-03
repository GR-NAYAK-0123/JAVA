package COLLECTION_FRAMEWORK;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSet_1 {
    void meth1(){
        System.out.println("Implementing TreeSet");

        TreeSet<Object> set = new TreeSet<Object>();

        set.add(10);    // Insertion order is not maintained but it maintains a ascending order
        // set.add("Java"); // Heterogeneous data is not allowed
        // set.add(null);  // Null is not allowed
        set.add(60);    // Duplicate data is not allowed
        set.add(25);   // It is available from java 1.2v
        set.add(99);   // Default size is 16 and load factor is 0.75 [Size increases by double]
        set.add(1);   // It is NOT synchronized 
        set.add(5);
        set.add(2);

        System.out.println(set);
        System.out.println("-----------------------------");
        System.out.println("Retrieving the data bysing Iterator");
        Iterator<Object> i = set.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Retrieving the data in reverse order bysing Iterator");
        Iterator<Object> i1 = set.descendingIterator();
        while(i1.hasNext()){
            System.out.print(i1.next()+" ");
        }
        System.out.println();
        System.out.println("headSet() : "+set.headSet(32));
        System.out.println("tailSet() : "+set.tailSet(34));

    }
    public static void main(String[] args) {
        new TreeSet_1().meth1();
    }
}
