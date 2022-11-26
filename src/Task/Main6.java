package Task;

import Task.MyClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("car1");
        cars.add("hcars2");
        cars.add("cars3333");

        Collections.sort(cars);
        System.out.println(cars);

        List<MyClass> myclass = new ArrayList<>();
        myclass.add(new MyClass(1));
        myclass.add(new MyClass(5));
        myclass.add(new MyClass(3));

        Collections.sort(myclass);
        System.out.println(myclass);

    }
}
