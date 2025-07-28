public class Switch{
    void meth1(){
        System.out.println("Implementing switch case");
        final int a = 300;
        final int x = 50;
        byte b = 65;

        switch(b - 55){
            //System.out.println("Hello world"); // C.E 
            
            default : 
                 System.out.println("Invalid output");
                 System.out.println("Default case will be executed if no case label got match with the key value");
                 break;
            case 10 :
                 System.out.println("Case 10 executed");
                 Switch obj=new Switch();
                 int i = 45;
                 if(i<50){
                    System.out.println("If block executed");
                    obj.meth2();
                 } else {
                    System.out.println("Else block executed");
                    obj.meth3();
                 }
                 break;
            case 'A' :
                System.out.println("Case 65 executed");
                System.out.println("int and char both are compatable");
                break;
            case a - 270 :
                System.out.println("Case 30 executed");
                System.out.println("Expressions are allowed in switch");
                break;
            case 40 :
                System.out.println("Case 40 executed");
                //x++;
                //x++;   // Final variables are constant
                break;
            case x :   // Every case label should be compile time constant
                System.out.println("Case 50 executed");
                break;
        }
    }
    void meth2(){
        System.out.println("meth2() called");
        System.out.println("Java is awesome");
    }
    void meth3(){
        System.out.println("meth3() called");
        System.out.println("Inside switch case we can write any valid java statement");
    } 
    public static void main(String[] args) {
        new Switch().meth1();
    }
}