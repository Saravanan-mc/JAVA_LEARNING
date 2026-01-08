import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Cherry");
        System.out.println(ts); // [Apple, Banana, Cherry] (sorted order)
    }
}
