import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myListInt = new ArrayList<>();
        myListInt.add(25);
        myListInt.add(10);
        myListInt.add(100);
        myListInt.add(1001);
        myListInt.add(10);
//        for(Integer x : myListInt){
//            System.out.println(x);
//        }

        List<String> cars = new ArrayList<>();
        cars.add("car1");
        cars.add("cars2");
        cars.add("cars3333");

        for(String str : cars)
        {
            System.out.print(str+" ");
        }

        cars.set(1, "new car");
        System.out.println("\n"+cars.get(1));

        cars.remove(1);
        System.out.println(cars.get(1));
        System.out.println(cars.size());
        for(String str : cars)
        {
            System.out.print(str+" ");
        }

        // cars.clear();
        System.out.println("\n"+cars.size());

        Iterator<String> it = cars.iterator();

        cars.set(1, "abc");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}