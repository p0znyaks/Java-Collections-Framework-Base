package Collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, false);

        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Barov", 3);


        linkedHashMap.put(7.5, st4);
        linkedHashMap.put(5.8, st1);
        linkedHashMap.put(7.2, st3);
        linkedHashMap.put(6.4, st2);

        for(Map.Entry<Double, Student> e : linkedHashMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println(linkedHashMap.get(5.8));
        System.out.println(linkedHashMap.get(6.4));

        for(Map.Entry<Double, Student> e : linkedHashMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
