/*
     If you want to see the output of our java program we need to perform two task
            a) Compilation
            b) Running
        
        Compilation :
      ------------------
    => The command for the compilaton is [javac FileName.java]
    => Whenever you give the command java compiler will check whether you have written the program according to java language  syntax or not. If it correct then it will generate a .Class file which is only consist of byte code 
    instructions which is only understandable by the machine, human can't understand that.
    =>In our scenarion that machine is JVM [Java virtual machine]

        Running :
     ----------------
     => The command for the running is java (Generated .Class FileName)
     => Whenever we give that command we will provide that .Class File as input to the JVM.
     => It will check whether the byte code instruction is correct or not.If it is correct then you will recieve the output or if it is not you will get an run time error

 */

package Demo;

// class ClassA {
//     void meth1(){
//         System.out.println(10);
//         ClassA aobj=new ClassA();  //Creating an object
//         aobj.meth2();
//         System.out.println("Hii");
//     }
//     void meth2(){
//         System.out.println(20);
//         ClassA aobj = new ClassA();
//         aobj.meth3();
//         System.out.println("Hello");
//     }
//     void meth3(){
//         System.out.println(30);
//         System.out.println("Welcome");
//     }
//     public static void main(String[] args) {
//         System.out.println("Start");
//         ClassA aobj = new ClassA();  //Creating an object
//         aobj.meth1();  //Calling a method
//         System.out.println("Java is awesome");
//     }
// }

/*
       int a;   //Variable Declaration

       a = 10;   //Variable initialization

       int b = 20;  //Variable declaration and initialization
 */

class ClassB{
    void meth1(){
        System.out.println("Hii");
    }
    void meth2(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        //ClassB bobj1;
        //bobj1.meth1(); //C.E because there is no object assign to that reference

        new ClassB().meth1();
        new ClassB().meth2();

        ClassB bobj2=new ClassB();
        bobj2.meth1();
        bobj2.meth2();

    }
}

