package Collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(7);
        queue.add(8);
        queue.add(10);
        queue.add(4);
        queue.add(1);
        System.out.println(queue.remove());
    }
}
