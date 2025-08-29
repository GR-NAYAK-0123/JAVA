package COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_1 {
    void meth1(){
        System.out.println("Implementing ArrayList\n");

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);     // Insertion order is maintained
        //al.add("java"); // Heterogeneous data is allowed when you are not using generic
        al.add(null);   // Null is allowed
        al.add(1);      // Duplicates are allowed
        al.add(86);     // It's available from java 1.2v
        al.add(99);     // I's default size is 10 [Size increases by half]
        al.add(11);      // It's not synchronized by default
        al.add(10);

        System.out.println("ArrayList : "+al);

        System.out.println("get() : "+al.get(4));
        System.out.println("get() : "+al.get(al.size()-1));
        System.out.println("size() : "+al.size());
        System.out.println("-----------------------------\n");
        System.out.println("Retrieving the data by using for loop");
        for(int i = 0;i<=al.size()-1;i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println("Retrieving the data in reverse order by using for loop");
        for(int i = al.size()-1;i>=0;i--){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println("Retrieving the data by using for-eah loop");
        for(Object data : al){
            System.out.print(data+" ");
        }     
        System.out.println();
        System.out.println("Retrieving the data by using the Iterator");
        Iterator<Integer> i = al.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println("-------------Methods-------------");
        al.add(al.size(),100);
        System.out.println(al);
        al.add(0,500);
        System.out.println(al);
        System.out.println("isEmpty() : "+al.isEmpty());
        System.out.println("Contains() : "+al.contains(11));
        System.out.println("==>"+al.remove((Object)100));
        System.out.println(al);
        System.out.println("==>"+al.remove((Object)2000));  // If the element is not present then it will return only false
        

    }
    public static void main(String[] args) {
        new Arraylist_1().meth1();
    }
}
