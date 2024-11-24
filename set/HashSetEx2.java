package Collections.set;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hSet1 = new HashSet<>();
        hSet1.add(5);
        hSet1.add(2);
        hSet1.add(3);
        hSet1.add(1);
        hSet1.add(8);

        HashSet<Integer> hSet2 = new HashSet<>();
        hSet2.add(7);
        hSet2.add(4);
        hSet2.add(3);
        hSet2.add(5);
        hSet2.add(8);

        HashSet<Integer> intersectOf1And2 = new HashSet<>(hSet1);
        intersectOf1And2.removeAll(hSet2);
        System.out.println(intersectOf1And2);
    }
}
