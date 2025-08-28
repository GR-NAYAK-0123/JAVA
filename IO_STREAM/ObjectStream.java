/*
     Serialization :
   -------------------
   => The process of writting an object into a file is called serialization. 
   => In other words it is a process of converting an object from java supported version to network supported version or file
      supported version

                    (implementation class)   (source)
                      ObjectInputStream  --> FileInputStream
      Object Streams 
                      ObjectOutputStream  --> FileOutputStream

    => This object stream is used to achieve serialization. 
    => In this object stream also the order is important. 
 */
package IO_STREAM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//import java.lang.ClassNotFoundException;

class ClassA implements Serializable{
    int a = 10;
    int b = 20;
}

class ClassB implements Serializable{
    int x = 100;
    int y = 200;
}

public class ObjectStream {
    void operation1() throws IOException, ClassNotFoundException{
        System.out.println("Implementing Serialization");

        ClassA aobj = new ClassA();
        ClassB bobj = new ClassB();

        System.out.println(aobj.a+" "+aobj.b);
        System.out.println(bobj.x+" "+bobj.y);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO_STREAM/file5.ser"));
        oos.writeObject(aobj);
        oos.writeObject(bobj);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO_STREAM/file5.ser"));
        ClassA aobj1 = (ClassA) ois.readObject();
        ClassB bobj1 = (ClassB) ois.readObject();

        System.out.println(aobj1.a+" "+aobj1.b);
        System.out.println(bobj1.x+" "+bobj1.y);
        ois.close();

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectStream obj = new ObjectStream();
        obj.operation1();
    }
}
