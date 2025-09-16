public class Recursion_Example {
    int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Recursion_Example obj = new Recursion_Example();
        System.out.println(obj.factorial(5));
    }
}
