package COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Iterator;

class ClassA{
    String name;
    int id;
    String dept;

    public ClassA(String name, int id, String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    @Override
    public String toString(){
        return "[name : "+name+" id : "+id+" dept : "+dept+"]";
    }
}

public class Arraylist_2 {
    void meth1(){
        System.out.println("Passing user defined Object into ArrayList\n");
        ArrayList<ClassA> al = new ArrayList<ClassA>();

        ClassA aobj1 = new ClassA("Raja", 20, "java");
        ClassA aobj2 = new ClassA("Conor", 35, "MMA");
        ClassA aobj3 = new ClassA("Bruce", 43, "Farming");

        al.add(aobj1);
        al.add(aobj2);
        al.add(aobj3);
        al.add(new ClassA("Ilia", 29, "Striking"));
        System.out.println("Objects are Inserted into the ArrayList");
        System.out.println(al);
        System.out.println("Retrieving the by using the iterator");
        Iterator<ClassA> i = al.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        new Arraylist_2().meth1();
    }
}
