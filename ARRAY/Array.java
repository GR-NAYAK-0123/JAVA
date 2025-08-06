package ARRAY;

public class Array {
    void meth1(){
        int arr1[];
        arr1 = new int[5];

        int arr2[] = new int[4];

        int arr3[] = {100, 200, 300};

        int arr4[] = new int[] {11, 12, 13, 14};

        // Getting length of an array
        System.out.println("arr1 length : "+arr1.length);
        System.out.println("arr2 length : "+arr2.length);
        System.out.println("arr3 length : "+arr3.length);
        System.out.println("arr4 length : "+arr4.length);

        // Providing value to an array
        arr1[0] = 10;
        arr1[1] = 20;

        //Retrieving the data from an array by using for loop
        for(int i = 0;i<arr1.length;i++){
            System.out.println("arr1 index "+i+" value :"+arr1[i]);
        }
        System.out.println("----------------------------------------");
        
        //Retrieving the data from an array in reverse order by using for loop
        for(int i = arr3.length-1;i>=0;i--){
            System.out.println("arr3 index "+i+" value : "+arr3[i]);
        }
        System.out.println("----------------------------------------");

        // Retrieving the data from an array by using for-each loop
        for(int data:arr4){
            System.out.println("Value : "+data);
        }

        //System.out.println(arr4[4]); // If we want access an index which is not available in our array then we will be getting 
                                     // ArrayIndexOutOfBoundException


    }
    public static void main(String[] args) {
        Array obj = new Array();
        obj.meth1();
    }
}
