public class Method_Overloading {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(3.5, 4.5));
    }
}
