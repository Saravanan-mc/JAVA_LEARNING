import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        queue.offer("Mango");
        System.out.println(queue);

        System.out.println(queue.size());

        System.out.println(queue.isEmpty());
    }
}
