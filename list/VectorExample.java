package Collections.list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        System.out.println(v.getFirst());
        System.out.println(v.getLast());
    }
}
