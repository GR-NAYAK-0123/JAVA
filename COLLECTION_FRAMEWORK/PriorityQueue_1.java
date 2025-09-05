package COLLECTION_FRAMEWORK;

import java.util.PriorityQueue;

public class PriorityQueue_1 {
    void meth1(){
        System.out.println("Implementing Priority Queue");

        PriorityQueue<Object> pq = new PriorityQueue<Object>();
        pq.add(10);  // Insertion order doesn't maintained
        // pq.add("Java");  // Heterogeneous data is not allowed
        // pq.add(null);   // Null is not allowed
        pq.add(20);    // Duplicates data is allowed
        pq.add(30);    // It is available from java 1.5v
        pq.add(40);    // It's default size is 11 and it increases by double
        pq.add(50);    // It is not synchronized
        pq.add(60);
        pq.add(10);

        System.out.println(pq);

        pq.offer(100);
        System.out.println(pq);
        System.out.println("----------------------------");
        System.out.println(pq.remove());   // It removes and returns the first element
        System.out.println(pq);
        System.out.println(pq.poll());    // It removes and returns the first element
        System.out.println(pq.peek());   // It only return the 1st element without removing
        
    }
    public static void main(String[] args) {
        new PriorityQueue_1().meth1();
    }
}
