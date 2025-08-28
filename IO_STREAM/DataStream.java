/*
   Data Stream :
 -----------------
 => Data stream are used to transfer primitive data types in a secure manner. 

                                     (implementation class)   (source)
                     DataInput         DataInputStream --> FileInputStream
    DataStream
                    DataOutput        DataOutputStream --> FileOutputStream

 => In this data stream in which order you are entering the data in same order you need to rettrieve the data otherwise you will
    get different or inconsistent data. 
 => In this data stream we need to remember the order. 
 */
package IO_STREAM;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
    void operation1()throws IOException{
        System.out.println("Implementing Data Stream");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("IO_STREAM/file4.txt"));
        System.out.println("Connection created");
        dos.writeInt(100);
        dos.writeChar('R');
        dos.writeBoolean(false);
        dos.writeInt(2000);
        System.out.println("Data Entered");
        dos.close();
    }
    void operation2() throws IOException{
        System.err.println("Reading the datatypes from a file");
        DataInputStream dis = new DataInputStream(new FileInputStream("IO_STREAM/file4.txt"));
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readInt());
        System.out.println("Data has retrieved");
        dis.close();
    }
    public static void main(String[] args) throws IOException{
        DataStream obj = new DataStream();
        obj.operation1();
        obj.operation2();
    }
}
