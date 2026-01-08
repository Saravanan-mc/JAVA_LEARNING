import java.util.*;
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1, "One");
        lhm.put(2, "Two");
        System.out.println(lhm); // preserves insertion order
    }
}
