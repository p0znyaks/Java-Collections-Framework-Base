package Collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Anton");
        arrayList1.add("Ivan");
        arrayList1.add("Anton");
        arrayList1.add("Borik");

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Ivan");
        arrayList2.add("Sanya");

        List<String> arrayList3 = new ArrayList<>(arrayList1);

        System.out.println(arrayList3);
        System.out.println(arrayList1 == arrayList3);
    }
}
