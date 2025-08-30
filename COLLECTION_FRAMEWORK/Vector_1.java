package COLLECTION_FRAMEWORK;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_1 {
    void meth1(){
        System.out.println("Implementing Vector\n");

        Vector<Object> v = new Vector<Object>();
        v.add(10);   // Insertion order is maintained
        v.add("Java");  // It allowes heterogeneous data
        v.add(null);   // Null is allowed
        v.add(20);     // Duplicate data is also allowed
        v.add(30);    // It is available from java 1.0v [So it is a legacy class]
        v.add(40);    // It's default size is 10 [it increases by double]
        v.add(50);    // It is synchronized
        v.add(10);

        System.out.println(v);
        v.add(v.size(), "Raja");
        System.out.println("Retrieving the data from the vector by using for-each loop");
        for(Object o : v){
            System.out.print(o+" ");
        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Retrieving the data from the vector by using Enumeration Interface");
        Enumeration<Object> e = v.elements();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement()+" ");
        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Retrieving the data from the vector by using Iterator");
        Iterator<Object> i = v.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new Vector_1().meth1();
    }
}
