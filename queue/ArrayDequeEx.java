package Collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addFirst(7);
        deque.addFirst(1);
        deque.addFirst(8);
        System.out.println(deque);
    }
}
