import java.util.HashSet;
import java.util.Set;

public class Main5 {
    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();
        cars.add("c1");
        cars.add("c2");
        cars.add("c3");

        cars.add("c1");
        System.out.println(cars);
    }
}
