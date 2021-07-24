import java.util.*;
import java.io.Console;

public class ArraysHW {
    public static void main(String[] args) {

        /**
         *
         * Code for first question: Sum in given array
         */
        int[] my_array = {3,2,2,4,3};
        int j = 0;
        int sum = 0;

        while (j<my_array.length){
            sum +=my_array[j];
            j++;
        }
        System.out.println(Arrays.toString(my_array));
        System.out.println("The sum of this array is: " + sum + "\n");


        //Question 2:
        System.out.printf("%n" + "For Question 2. The output is: 2" + "%n");
        System.out.println("\n");
        //Question 3:
        toPower(6,3);




    }

    public static double[] toPower(int a , int b){
       int size = a;
       int power = b;

       double[] newArray = new double[size];
       for(int i = 0; i < newArray.length;i++){
           newArray[i] = Math.pow(i,power);
       }

        System.out.println("Output to question 3 in Array HW:");
        System.out.println(Arrays.toString(newArray));

        return newArray;
    }
}


