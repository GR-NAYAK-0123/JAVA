package COLLECTION_FRAMEWORK;

// import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
// import java.util.Map.Entry;

public class HashTable_1 {
    void meth1(){
        System.out.println("Implementing HashTable");

        Hashtable<Object,Object> ht = new Hashtable<Object,Object>();
        ht.put(10, 10);  //It doesn't maintains insertion order
        ht.put("Java",10);  // Heterogeneous key and values are allowed
        //ht.put(null,null);          // Null key and values are not allowed
        ht.put(20,"CSs");    // It accepts duplicate data
        ht.put("Html",30);   // It is available from java 1.0v (Leagacy class)
        ht.put(40,"Europe");  // Default capacity is 12, Loadfactor 0.75 and Size increases by double
        ht.put(50,"$120k");   // It is synchronized
        //ht.put(50,null);

        System.out.println(ht);
        System.out.println("-------------------------------");
        System.out.println("Retrieving the key's from the Hashtable");
        LinkedHashSet<Object> lm = new LinkedHashSet<Object>(ht.keySet());
        Iterator<Object> i1 = lm.iterator();
        while(i1.hasNext()){
            System.out.print(i1.next()+" ");
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Retrieving the key-value pairs from the Hashtable");
        //HashSet<Object> hs = new HashSet<Object>(ht.entrySet());
        //Iterator<Object> i2 = hs.iterator();
        // while(i2.hasNext()){
        //     Entry e = (Entry) i2.next();
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }
    }
    public static void main(String[] args) {
        new HashTable_1().meth1();
    }
}
