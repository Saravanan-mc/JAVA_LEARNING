import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();


        deque.add("Apple");
        deque.add("Banana");
        deque.add("Orange");
        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque.removeFirst());
        System.out.println(deque);

        System.out.println(deque.removeLast());
        System.out.println(deque);

        deque.offerFirst("Mango");
        deque.offerLast("Grapes");
        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);

        System.out.println(deque.size());

        System.out.println(deque.isEmpty());
    }
}
