import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class loopMapNumbers {
    public static void main(String[] args) {

        int sum = 0;
        int product = 1;
        int largest = 0;
        int smallest = 0;

        ArrayList <Integer> list = new ArrayList<>();

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter 5 numbers please and thank you");

        while (list.size() < 5) {
            list.add(input.nextInt());
        }

        for (Integer num: list) {
            sum += num;
            product*=num;
        }

        System.out.println("The sum of all five numbers is: " + sum);
        System.out.println("The product of all five numbers is: " + product);
        System.out.println("The largest number is: " + Collections.max(list));
        System.out.println("The smallest number is: " + Collections.min(list));





    }
}
