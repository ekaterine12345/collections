import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) {
        Stack<String> cars = new Stack<>(); //LIFO
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println(cars.pop());
        System.out.println(cars.pop());
        System.out.println(cars.push("new_car1"));
        System.out.println(cars.size());
        System.out.println(cars);

        Queue<String> pq = new PriorityQueue<>(); //FIFO
        pq.add("element 1");
        pq.add("element 2");
        pq.add("element 3");
        System.out.println(pq);
    }
}
