import java.util.ArrayList;
import java.util.LinkedList;

public class Main3 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.addFirst("first_car");
        cars.addLast("last_car");

       // System.out.println(cars);
        for(String str : cars)
        {
            System.out.print(str+" ");
        }

        System.out.println("\n"+cars.getFirst());
        System.out.println(cars.getLast());

    }
}
