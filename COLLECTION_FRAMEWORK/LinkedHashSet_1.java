package COLLECTION_FRAMEWORK;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_1 {
    void meth1(){
        System.out.println("Implementing LinkedHashSet");

        LinkedHashSet<Object> set = new LinkedHashSet<Object>();

        set.add(10);      //Insertion Order is maintained
        set.add("Java");  // Heterogeneous data is allowed
        set.add(null);   // Null is allowed
        set.add(20);      // Duplicates are not allowed
        set.add(30);     // It is available from java 1.4v
        set.add(40);    // Default capacity is 16 and Load factor is 0.75 [Size increases by double]
        set.add(50);   // It is not Synchronized
        set.add(60);
        set.add(10);

        System.out.println(set);

        System.out.println("----------------------");
        System.out.println("Retrieving the data by using Iterator");
        Iterator<Object> i = set.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new LinkedHashSet_1().meth1();
    }
}
