public class Method_WithParam {
    void add(int a, int b) {
        System.out.println("Sum: " + (a+b));
    }

    public static void main(String[] args) {
        Method_WithParam obj = new Method_WithParam();
        obj.add(5, 10);
    }
}
