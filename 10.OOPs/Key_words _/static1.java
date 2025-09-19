


class Father {
    char genter = 'M';
    static void f() {
        System.out.println("Father .....");
    }
}

class Daughter extends Father {
    char genter = 'F';
    void d() {
        System.out.println("Daughter ......");
    }
}

class static1 {
    public static void main(String[] args) {
        Daughter ob = new Daughter();
        Father.f();
    }
}
