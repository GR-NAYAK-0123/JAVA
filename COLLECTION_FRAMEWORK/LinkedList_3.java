/*
    Queue Interface :
  --------------------
  => This implementation class for queue interface is linkedlist and priority queue
  => In queue the elements are stored in FIFO order
  => If we are creating an object of linkedlist with linkedlist reference variable then we can access the complete functionality
     of both linkedlist and list interface
  => From java 1.5v onwards linkedlist also implements queue interface
 */
package COLLECTION_FRAMEWORK;

import java.util.List;
import java.util.LinkedList;

public class LinkedList_3 {
    void meth1(){
        List<Object> li = new LinkedList<Object>();
        li.add(10);
        //li.offer(20); // C.E bcz we are trying to access queue interface mrthod
        System.out.println(li);

        LinkedList<Object> ll = new LinkedList<Object>();
        ll.add(10);
        ll.offer(20);
        System.out.println(ll);
    }
    public static void main(String[] args) {
        new LinkedList_3().meth1();
    }
}
