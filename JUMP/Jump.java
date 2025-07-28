package JUMP;

public class Jump {
    void meth1(){
        for(int i = 1;i<=10;i++){
            if(i == 5){
                break;
            }
            System.out.println("i value is "+i);
        }
        System.out.println("Compiler came out from the loop");
    }
    public static void main(String[] args) {
        new Jump().meth1();
    }
    
}
