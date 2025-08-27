/*
    Character Stream :
  ----------------------
  => In this character stream the data will transfered in the form of characters and the length of each data packet is 2 bytes. 
  => It is Two form such as 
        
         a) Reader --> FileReader (impelementation class)
            read() : The return tye of this method is int,it will return the ASCII value of the characters. If there is no 
                     character is present then it will return -1. 
         
         b) Writer --> FileWriter (implementation class)
            write() : It is paramterized method having one parameter
                      => Either int 
                      => Or String
 */


package IO_STREAM;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    void operation1() throws IOException {
        System.out.println("Reading the data");
        FileReader fr = new FileReader("IO_STREAM/file2.txt");
        System.out.println("Connection created");
        int i;
        while((i = fr.read()) != -1){
            System.out.print((char)i);
        }
        System.out.println();
        System.out.println("Data Retrieved");
        fr.close();
    }
    void operation2() throws IOException{
        System.out.println("Writting the Data into a file");
        FileWriter fw = new FileWriter("IO_STREAM/file1.txt",true);
        System.out.println("Connection created");
        String statement = " I am from Kendrapara";
        fw.write(statement);
        System.out.println("Written Successfully");
        fw.close();
    }
    void operation3() throws IOException{
        System.out.println("Reading from one file and writting into another file");
        FileReader fr = new FileReader("IO_STREAM/file2.txt");
        FileWriter fw = new FileWriter("IO_STREAM/file1.txt", true);
        int i;
        while((i = fr.read()) != -1){
            fw.write(i);
        }
        System.out.println();
        System.out.println("Data Transfered successfully");
        fr.close();
        fw.close();
    }
    public static void main(String[] args) throws IOException{
        CharacterStream obj = new CharacterStream();
        //obj.operation1();
        //obj.operation2();
        obj.operation3();
    }
}
