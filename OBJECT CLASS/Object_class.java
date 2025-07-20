/*
       Understanding Object Class :
    -----------------------------------
    => For every java class either it is predefined or userdefined Object class is act as the parent class by default.
    => It is a pre-defined class which is present in java.lang package.
    => Object class is the first class in java heirarchy.
    => Any Class object can access the method which is present inside the object class. 
    => There is some method in object class i.e

    1) hashCode() : This method provide a unique identification number to your object which is used to distinguish your
                    object with others
                   -> This method doesn't give you the address location of your object.
                   -> Actually you can not get the address location of any object.
    2) equals() : The return type of this method id boolean. It checks the address location of two object. 
                   -> If the address location is same then it will return true otherwise it returns false.
    3) getClass() : This method returns or give you a fully qualified class name.   
    4) toString() : This method convert your object into a string represented format.   
    5) finalize() : This method is internally called by the garbage collector.  
                   -> Whenever a object is eligible for destruction then garbage collector will act on your program at that time 
                      this method called.   

 */

 class ClassA {
    int meth1(){
        System.out.println("meth1() called");
        return 100;
    }
    public static void main(String[] args) {
        ClassA aobj1 = new ClassA();
        ClassA aobj2 = new ClassA();

        int aobj1hashCode = aobj1.hashCode();
        int aobj2hashCode = aobj2.hashCode();

        System.out.println("aobj1 hashCode() is : "+aobj1hashCode);
        System.out.println("aobj2 hashCode() is : "+aobj2hashCode);

        System.out.println(aobj1.equals(aobj2));   //false
        System.out.println(aobj1.equals(aobj1));  //true bcz both are same object

        System.out.println("aobj1 getClass() is : "+aobj1.getClass());
        System.out.println("aobj2 getClass() is : "+aobj2.getClass());

        System.out.println("aobj1 toStrint() is : "+aobj1.toString());
        System.out.println("aobj2 toStrint() is : "+aobj2.toString()); 
        
    }
 }