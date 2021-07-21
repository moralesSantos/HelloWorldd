import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class LoopMapCars {
    public static void main(String[] args) {


        HashMap<String,String> carLot = new HashMap<>();

        carLot.put("Honda", "Civic");
        carLot.put("Toyota", "Corolla");
        carLot.put("BMW", "i8");
        carLot.put("Lexus","ES Hybrid");
        //carLot.put("Honda", "Accord");


//loop through the hash map and return each key/value pair
        for (Map.Entry<String, String> entry : carLot.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("OH, what car model are you looking for?");
        String carModel = input.nextLine();

        if (carLot.containsKey(carModel)== true){
            System.out.println("Yes we do have that car model. Our " + carModel + " selection is right over here..");
            System.out.println(carModel + " "+ carLot.get(carModel));
        } else {
            System.out.println("Sorry we do not have that model in stock :C");
        }









    }
}
