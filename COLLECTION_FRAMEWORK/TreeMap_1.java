package COLLECTION_FRAMEWORK;

import java.util.TreeMap;

public class TreeMap_1 {
    void meth1(){
        System.out.println("Implementing TreeMap");
        TreeMap<Object,Object> tm = new TreeMap<Object,Object>();
        tm.put(10,10);   //It doesn't maintain the insertion order
        tm.put(20,"java");  // Heterogeneous key are not allowed but values are allowed
        //tm.put("java,20");         // Null keys are not allowed but values are allowed
        //tm.put(null,null);        // Duplicates are allowed
        tm.put(30,null);  // It is available from Java 1.2v
        tm.put(40,"css");  // Default capacity is 16, Loadfactor is 0.75 and size increases by double
        tm.put(50,"europe");  //It is not synchronized

        System.out.println(tm);
    }
    public static void main(String[] args) {
        new TreeMap_1().meth1();
    }
}
