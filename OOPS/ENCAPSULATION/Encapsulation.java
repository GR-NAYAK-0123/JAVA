/*
      Encapsulation :
   --------------------
   It is the process of making a field as private and provide access to that field with the help of public methods, i.e through getters and setters

 */

package OOPS.ENCAPSULATION;
import java.util.Scanner;

public class Encapsulation {
    private int studentRollNumber;
    private String studentName;

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentRollNumber(int studentRollNumber){
        this.studentRollNumber = studentRollNumber;
    }
    public int getStudentRollNumber(){
        return studentRollNumber;
    }
}



class ClassA{
    Scanner sc = new Scanner(System.in);
    void meth1(){
        Encapsulation aobj=new Encapsulation();
        System.out.println("Please enter the name : ");
        aobj.setStudentName(sc.next());
        System.out.println("Please enter the student roll Number : ");
        aobj.setStudentRollNumber(sc.nextInt());
        System.out.println("Student name : "+aobj.getStudentName());
        System.out.println("Student roll Number : "+aobj.getStudentRollNumber());

    }
    public static void main(String[] args) {
        System.out.println("Start");
        ClassA obj=new ClassA();
        obj.meth1();
    }
}