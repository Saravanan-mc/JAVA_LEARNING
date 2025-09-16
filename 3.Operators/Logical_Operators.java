public class Logical_Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println((a > b) && (a > 0));  // true && true → true
        System.out.println((a > b) && (a < 0));  // true && false → false
        System.out.println((a < b) || (a > 0));  // false || true → true
        System.out.println((a < b) || (a < 0));  // false || false → false
        System.out.println(!(a > b));            // !(true) → false
        System.out.println(!(a < b));            // !(false) → true
    }
}

