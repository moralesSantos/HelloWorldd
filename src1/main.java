public class main {
    public static void main(String[] args) {

        pet max = new pet("Max",5,"CA",true);

        System.out.println(max.getName());
        System.out.println(max.getAge());
        System.out.println(max.getLocation());
        System.out.println(max.isType());


        car family = new car("Red", "Sedan");
        System.out.println(family.getColor());

    }
}
