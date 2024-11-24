package Collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("Zaur");
    set.add("Oleg");
    set.add("Marina");
    set.add("Igor");

    System.out.println(set.contains("Igor"));

    for(String s : set) {
        System.out.println(s);
    }

    }
}
