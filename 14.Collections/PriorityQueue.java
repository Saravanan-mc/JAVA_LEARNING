import java.util.*;
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println(pq.poll()); // 10 (smallest first)
        System.out.println(pq);
    }
}
