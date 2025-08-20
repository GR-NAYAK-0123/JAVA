package EXCEPTION_HANDLING;

import java.io.FileInputStream;
import java.io.IOException;

public class Throw_Throws {
    int avl_amt = 10000;

    void meth1(int wid_amt){
        if(avl_amt < wid_amt){
            throw new NullPointerException("Insufficient Funds");
        }
        else{
            System.out.println("Transaction successful");
        }
    }

    void meth2() throws IOException {
        System.out.println("--------meth2()---------");
        FileInputStream file=new FileInputStream("EXCEPTION_HANDLING/file1.txt");
        System.out.println("Connection created");
        file.close();
    }
    public static void main(String[] args) throws IOException{
        Throw_Throws obj = new Throw_Throws();
        obj.meth1(20000);
        obj.meth2();
    }
}
