//package ITERATION;

public class While {
    void meth1(int a){
        System.out.println("meth1() called");
        while(a <= 5){
            System.out.println("a value is : "+a);
            a++;
        }
        System.out.println("meth1() executed");
    }
    void meth2(int i){
        while( i <= 5)
           System.out.println("i value is : "+i);

    }
    void meth3(int i){
        while(true){
            System.out.println("i value is : "+i);
            i++;
            break;  // if compiler came across break statement then it will immediately came out from the loop
        }
        //System.out.println("meth3() executed");  // Un-reachable code

    }
    void meth4(int a){
        do {
            System.out.println("a value is : "+a);
            a++;
        } while(a <= 5);
        System.out.println("meth4() executed : "+a);
    }
    public static void main(String[] args) {
        While obj=new While();
        obj.meth4(1);
    }
}
