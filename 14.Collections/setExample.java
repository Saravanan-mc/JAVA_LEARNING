import java.util.Set;
import java.util.HashSet;

public class setExample {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        
        s.add(10); s.add(10); s.add(20); s.add(30); s.add(40); s.add(50); s.add(60);
        System.out.println(s);

        s.remove(20);
        System.out.println(s);
    }
}
