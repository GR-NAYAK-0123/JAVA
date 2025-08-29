package COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_time {
    private static Object arr[];

     static{
        arr = new Object[100000];
        for(int i = 0;i<arr.length;i++){
            arr[i] = new Object();
        }
     }

     void ArrayListTime(){
        long start, end;

        ArrayList<Object> al = new ArrayList<Object>();
        start = System.currentTimeMillis();
        for(Object o : arr){
            al.add(o);
        }
        end = System.currentTimeMillis();
        System.err.println("ArrayList Construction time : "+(end-start));
     }
     void LinkedListTime(){
        long start,end;
        LinkedList<Object> ll = new LinkedList<Object>();
        start = System.currentTimeMillis();
        for(Object o : arr){
            ll.add(o);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList Construction time : "+(end-start));

     }
     public static void main(String[] args) {
        LinkedList_time obj = new LinkedList_time();
        obj.ArrayListTime();
        obj.LinkedListTime();
     }
}
