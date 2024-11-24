package Collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExp {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Anton");
        arrayList.add("Sanya");
        arrayList.add("Kolya");
        arrayList.add("Elena");
        System.out.println(arrayList);

        Iterator<String> iterator = arrayList.iterator();

        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList);
    }
}
