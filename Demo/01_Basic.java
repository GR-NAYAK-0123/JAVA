package Demo;

/*
    In Java there are 3 basic java programming elements are there
       1)Class  -  Most of the time we are using class probably 90% of the time
       2)Interface - Whenever we want to achieve abstration at that time we are using interface (8-9%)
       3)Enum - Whenever our program is having universal constant at that time we are using enum (less than 2%)

        Syntax :
    --------------
    Syntax means some set of rules which we need to follow whenever we are writting the code if we are not following that rule we will be getting an error

    Access Modifiers :
  -----------------------
    In java we are having four access modifiers are there. These access modifiers provides access restriction which will enhance the data security.
            a)public
            b)private
            c)protected
            d)default

    Note : We can use only two access modifiers for the java class (public and default)      
    
    Syntax of class :
     <AccessModifier> class <ClassName> {
             1)Variables
             2)Methods
             3)Create an Object
             4)Blocks
     }

     Methods :
   -------------
   In java method is place where you can write the business logic
   <AccessModifiers> <returnType> MethodName (){
          -------;       
                           Method body
          -------;
   }

   Return type :
  ---------------
  For the return type we have four option
  1)void
  2)All 8 primitive data types [int, byte, short, long, float, double, char, boolean]
  3)Objects
  4)Classes

  Example :
      public void method1(){
             ------;
             ------;
      }

   Note :
     1)Every java program execution should STARTS from main() and ENDS with main()
     2)If we want to execute your program writting main() is mandatory
     3)main() will executes automatically NO NEED TO CALL

   ==> new keyword is always used to create an object

   syntax of main method :
        public static void main(String []args){
                
        }

 */

class Introduction {
    public void msg(){
        System.out.println("It's raining outside");
        System.out.println("Even though we are enjoying java");
    }
    public void display(){
        System.out.println("Java is awesome");
    }
    public static void main(String[] args) {
        System.out.println("Good Morning");
        Introduction obj=new Introduction();
        obj.msg();
        obj.display();
    }
}
