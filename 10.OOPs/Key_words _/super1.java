class Father {
    char a = 'A';
}

class Mother extends Father {
    char a = 'B';

    void show() {
        System.out.println(a); 
        System.out.println(super.a); // use to access parent class veriable name
    }
}

public class super1 {
    public static void main(String[] args) {
        Mother ob = new Mother();
        ob.show();
    }
}
