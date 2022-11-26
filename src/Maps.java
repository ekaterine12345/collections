import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Georgia", "Tbilisi");
        myMap.put("France", "Paris");
        myMap.put("Germany", "Berlin");

        System.out.println(myMap);

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "element1");
        students.put(20, "element2");
        students.put(12, "element22222");
        System.out.println(students);
        System.out.println(students.get(12));
        System.out.println(students.get(20));


//        Map map=new HashMap();
//        //Adding elements to map
//        map.put(1,"Amit");
//        map.put(5,"Rahul");
//        map.put(2,"Jai");
//        map.put(6,"Amit");
//        //Traversing Map
//        Set set=map.entrySet();
//        System.out.println(set);


    }

    static void s(){
        System.out.println("hi");
    };
}
