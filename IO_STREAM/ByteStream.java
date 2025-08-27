/*
    Byte Streams :
  -------------------
  => In byte streams the data will be transfered in the form of bytes and the length of each data packet is 1 byte. 
  => It has classified into two streams

            a) InputStream --> FileInputStream (implementation class)
               read() : The return type of this metho is int, it will return the ASCII value of the character if there is no 
                        character is present then it will return -1. 
            
            b) OutputStream --> FileOutputStram (implementation class)
               write() : It is paremeterized method having one parameter
                        => Either int
                        => Or byte array
 */


package IO_STREAM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    void operation1() throws IOException {
        System.out.println("Reading the data from a file");
        FileInputStream fis=new FileInputStream("IO_STREAM/file1.txt");
        System.out.println("Connection created");
        for(int i = fis.read();i != -1;i = fis.read()){
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("Data retrieved successfully");
        fis.close();
    }
    void operation2() throws IOException{
        System.out.println("Writting the data into a file");
        FileOutputStream fos = new FileOutputStream("IO_STREAM/file2.txt", true);
        System.out.println("Connection created");
        String s = ", I am Raja Nayak";
        byte arr[] = s.getBytes();
        fos.write(arr);
        System.out.println("Written successfully");
        fos.close();
    }
      void operation3() throws IOException{
        System.out.println("Reading data from a file and writting that data into another file");
        FileInputStream fis = new FileInputStream("IO_STREAM/file2.txt");
        FileOutputStream fos = new FileOutputStream("IO_STREAM/file3.txt");
        System.out.println("Connection created");
        int i;
        while((i = fis.read()) != -1){
            fos.write(i);
        }
        System.out.println("Data read and written successfully");
        fis.close();
        fos.close();
    }
    
    public static void main(String[] args) throws IOException {
        ByteStream obj = new ByteStream();
        //obj.operation1();
        //obj.operation2();
        obj.operation3();
    }
}
