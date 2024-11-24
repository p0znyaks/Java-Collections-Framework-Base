package Collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
    TreeMap<Student, Double> treeMap = new TreeMap<>();

    Student st1 = new Student("Zaur", "Tregulov", 3);
    Student st2 = new Student("Mariya", "Ivanova", 1);
    Student st3 = new Student("Sergey", "Petrov", 4);
    Student st4 = new Student("Igor", "Barov", 3);
    Student st5 = new Student("Sanya", "Solinov", 1);
    Student st6 = new Student("Nikolay", "Antonov", 4);
    Student st7 = new Student("Anton", "Aleksandrovich", 3);
    Student st8 = new Student("Zaur", "Tregulov", 3);

//    treeMap.put(st1, 5.8);
//    treeMap.put(st2, 6.4);
//    treeMap.put(7.2, st3);
//    treeMap.put(7.5, st4);
//    treeMap.put(7.9, st5);
//    treeMap.put(8.2, st6);
//    treeMap.put(9.1, st7);
//    treeMap.put(9.8, st8);
//
//    treeMap.containsKey(new Student("Zaur", "Tregulov", 3))
//
//    for(Map.Entry<Double, Student> e : treeMap.tailMap(6.5).entrySet()) {
//        System.out.println(e.getKey() + " : " + e.getValue());
//    }
//    System.out.println(treeMap.lastEntry());
    }
}
