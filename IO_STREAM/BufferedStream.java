/*
    Buffered Stream :
  --------------------
  => A buffer is a position of memory that is used to store a stream of data. 
  => In IO Operation each read or write request is directly handled by the underlying operating system. 
  => This can make a program less efficient since each such requests often triggers disk access, network activity, or some other
     operations that is relatively expensive. 
  => To reduce this we will use buffered streams. 
  => Buffered stream are exactly same like byte and character streams but with more efficiency. 

                             (implementation class)    (source)
                             BufferedInputStream --> FileInputStream 
        BufferedByteStream 
                            BufferedOutputStream --> FileOutputStream


                             (implementation class)  (source)
                                 BufferedReader --> FileReader
        BufferedCharacterStream
                                 BufferedWriter --> FileWriter

   1) BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file path"));
   2) BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file path"));
   3) BufferedReader br = new BufferedReader(new FileReader("file path"));
   4) BufferedWriter bw = new BufferedWriter(new FileWriter("file path"));
 */
package IO_STREAM;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStream {
    void operation1() throws IOException {
        System.out.println("Retrieving the data by using bufferd byte stream");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IO_STREAM/file1.txt"));
        System.out.println("Connection created");
        for(int i = bis.read(); i != -1; i = bis.read()){
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("Data retrieved");
        bis.close();
    }
    public static void main(String[] args) throws IOException{
        BufferedStream obj = new BufferedStream();
        obj.operation1();
    }
}
