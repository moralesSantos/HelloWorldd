import java.util.Scanner;
import java.util.*;


public class HelloWorld {
    public static void main(String[] args){

//       HW Java Types, Variables and Branching
//        int DOG;
        String CaT = "cat";
//        System.out.println(DOG);
        System.out.println(CaT);
        myMethod();

//        String[] arr = new String[5]; //array size is set in stone
        String[] arr1 = {"John", "Michelle", "Tommy"};
        List<String> list = new ArrayList<>();


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(5);
        arrayList.add(10);

        System.out.println(arrayList.get(1));


    }

    static void myMethod(){
        int Dog;
//        System.out.println(Dog);

    }
}
