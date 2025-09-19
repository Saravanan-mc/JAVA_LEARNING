

class Exception3 {
    void check(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is Invalid");
        } else {
            System.out.println(age);
        }
    }
}

public class ExceptionusingThrowKey {
    public static void main(String[] args) {
        Exception1 obj = new Exception1();

        try {
            obj.check(7); 
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

       System.out.println("Program continues after exception...");
    }
}
