import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");

        System.out.println(s);

        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.search("a"));

        System.out.println(s.contains("b"));

        System.out.println(s.size());

        System.out.println(s.isEmpty());

        s.clear();
        System.out.println(s);

    }
}
