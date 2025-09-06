package COLLECTION_FRAMEWORK;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMap_1 {
    void meth1(){
        System.out.println("Implementing HashMap");

        HashMap<Object,Object> map = new HashMap<Object,Object>();
        map.put(10,"java");  //Insertion order od not maintained
        map.put("java",10);  // Heterogeneous key and value are allowed
        map.put(null,null);  // Null key and value are allowed
        map.put(100,"Css");  // Duplicates are allowed but it will replace the previous one
        map.put(200,"Html");           // It is available from Java 1.2v
        map.put(300,"Oracle");        // Default capacity is 16, Loadfactor is 0.75 and increases by double
        map.put(500,"USA");
        
        System.out.println(map);
        System.out.println("Retrieving the Keys from the HashMap");
        HashSet<Object> set = new HashSet<Object>(map.keySet());
        Iterator<Object> i = set.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Trying to retrieve the pairs or we can say entry set from the HashMap");
        HashSet<Entry<Object,Object>> set1 = new HashSet<Entry<Object,Object>>(map.entrySet());
        Iterator<Entry<Object,Object>> i1 = set1.iterator();
        while(i1.hasNext()){
            Entry<Object,Object> e = i1.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    public static void main(String[] args) {
        new HashMap_1().meth1();
    }
}
