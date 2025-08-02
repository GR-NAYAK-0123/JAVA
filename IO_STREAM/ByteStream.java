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
  
    
    public static void main(String[] args) throws IOException {
        ByteStream obj = new ByteStream();
        //obj.operation1();
        obj.operation2();
        //obj.operation3();
    }
}
