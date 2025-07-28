public class For_loop {
    void meth1(){       //It will generate infinite loop
        int i = 1;
        for(;i<=5;)
            //int x = 90;  //We can't write any declarative sentence here
            System.out.println("i value is : "+i);
            i++;
    }
    void meth2(){
        int i = meth4();
        for(System.out.println("--------meth2()-----");i<=5;meth3()){
            System.out.println("i value is "+i);
            i++;
        }
    }
    static void meth3(){
        System.out.println("----------------------------");
    }
    static int meth4(){
        System.out.println("Java is awesome");
        return 100-99;
    }
    void meth8(){
        int i = 1;
        for(;;){
            System.out.println("i value is "+i);
            i++;
        }
        //System.out.println("meth8() execution completed");    //Unreachable code
    }
    void meth9(){
        int i = 1;
        for(System.out.print("Java "),System.out.println(" is awesome");i<=3;System.out.println("Hii"),System.out.println("------------")){
            System.err.println("i value is "+i);
            i++;
        }
    }
    public static void main(String[] args) {
        For_loop obj=new For_loop();
        obj.meth9();
    }
}