import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");

        System.out.println(s);

        System.out.println(s.peek());

        
    }
}
