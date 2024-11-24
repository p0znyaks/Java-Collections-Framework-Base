package Collections.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);
        System.out.println(set);
        set.remove(3);
        System.out.println(set);
    }
}
