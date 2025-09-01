package COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSet_1 {
    void meth1(){
        System.out.println("Implementing HashSet\n");

        HashSet<Object> set = new HashSet<Object>();
        set.add(10);     //Insertion order doesn't maintained
        set.add("java"); //Heterogeneous data is allowed
        set.add(null);    // NUll is allowed
        set.add(20);    // Duplicates data is not allowed
        set.add(30);    //It is available from Java 1.2v
        set.add(40);    //It's default capacity is 16 [Loadfactor is 0.75] and Increased by double
        set.add(50);    // It is not synchronized
        set.add(20);
        set.add("Java");

        System.out.println(set);
        System.out.println("--------------------------");
        System.out.println("Retrieving the data by using for-each loop");
        for(Object o : set){
            System.out.print(o+" ");
        }
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Retrieving the data by using Iterator");
        Iterator<Object> i = set.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Retrieving the data by using List Iterator");
        ArrayList<Object> al = new ArrayList<Object>(set); //We can directly use ListIterator for HashSet we need to use ArrayList
        ListIterator<Object> li = al.listIterator(); //Here we have used ArrayList so it maintains the insertion order
        while(li.hasNext()){
            System.out.print(li.next()+" ");
        }
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Retrieving the data in reverse order by using List Iterator");
        while(li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        new HashSet_1().meth1();
    }
}
