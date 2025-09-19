


class UserDefined extends Exception {
    UserDefined(String s) {
        super(s);
    }
}

class ch {
    static void check(int a) throws UserDefined,ArithmeticException {
        if (a < 18) {
            throw new UserDefined("Age is invalid");
        } else {
            System.out.println(a);
        }
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            ch.check(17);
        } catch (UserDefined e) {
            System.out.println(e.getMessage());
        }
    }
}
