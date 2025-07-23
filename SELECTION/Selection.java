package SELECTION;

public class Selection {
    String result(int marks){
        if(marks >= 80){
            return "good";
        } 
        else if (marks >= 50 && marks < 80){
            return "average";
        }
        else {
            return "bad";
        }
    }
    void College_Name(String name){
        /*
          If you are not writting any flower braces in "if" statement then only the immediate first statement is dependent on if
          statement and in that statement you can't write any declarative statement. 
         */
        if(name.equals("VSSUT"))
             System.out.println("He is from VSSUT");
        System.out.println("End");
    }
    public static void main(String[] args) {
        Selection obj=new Selection();
        System.out.println("Having "+(obj.result(86))+" knowledge");
        obj.College_Name("VSSUT");

    }
}