import java.util.Scanner;
public class main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        System.out.println("Enter two numbers to add, subtract, .....");
        System.out.println("Enter number 1: ");
        num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        num2 = input.nextInt();

        System.out.println(Calculator.add(num1,num2));
        System.out.println(Calculator.substraction(num1,num2));
        System.out.println(Calculator.multiplication(num1,num2));
        System.out.println(Calculator.square(num1,num2));

        if (num2 == 0){
            System.out.println("Cannot divide by zero");
            System.exit(-1);
        }
        System.out.println(Calculator.division(num1,num2));
    }

}
