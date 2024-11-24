package Collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.putIfAbsent(1000, "Oleg Ivanov");
        System.out.println(map1);
        System.out.println(map1.containsValue("Zaur Tregulov"));
        System.out.println(map1.containsKey(6578));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
