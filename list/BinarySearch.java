package Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            list.add((int)(i * Math.random()));
        }
        Collections.sort(list);
        for(int i : list) {
            System.out.println(list.indexOf(i) + " " + i);
        }
        long start = System.currentTimeMillis();
        int index = Collections.binarySearch(list, 50);
        long workTime = System.currentTimeMillis() - start;
        System.out.println(index);
        System.out.println(workTime);
    }
}
