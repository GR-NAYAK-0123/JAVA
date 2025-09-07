package COLLECTION_FRAMEWORK;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class LinkedHashMap_1 {
    void meth1(){
        System.out.println("Implementing LinkedHashMap");

        LinkedHashMap<Object,Object> lm = new LinkedHashMap<Object,Object>();
        lm.put(10,10);    //It maintains insertion order
        lm.put(20,"java"); // Heterogeneous key and values are allowed
        lm.put("java",30); // Null key and values are allowed
        lm.put(30,"html");  // Duplicate value are allowed but it will replace the previous value
        lm.put(40,"Spring"); // Default capacity is 16, Loadfactor is 0.75 and it increases by double
        lm.put(50,"Europe");  // It is not synchronized
        lm.put("Raja","europe");   // It is available from java 1.4v
        lm.put(null,null);

        System.out.println(lm);
        System.out.println("----------------------");
        System.out.println("Retrieving the key from the LinkedHashMap");
        ArrayList<Object> al = new ArrayList<Object>(lm.keySet());
        Iterator<Object> i1 = al.iterator();
        while(i1.hasNext()){
            System.out.print(i1.next()+" ");
        }
        System.out.println();
        System.out.println("----------------------");
        System.out.println("Retrieving the key-value pair from the LinkedHashMap");
        LinkedHashSet<Entry<Object,Object>> lh = new LinkedHashSet<Entry<Object,Object>>(lm.entrySet());
        Iterator<Entry<Object,Object>> i2 = lh.iterator();
        while(i2.hasNext()){
            Entry<Object,Object> e = i2.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    public static void main(String[] args) {
        new LinkedHashMap_1().meth1();
    }
}
