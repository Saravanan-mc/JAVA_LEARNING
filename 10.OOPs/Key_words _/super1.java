class Father {
    char a = 'A';
    void print(){
        System.out.println("This is father print");
    }
}

class Mother extends Father {
    char a = 'B';

    void print(){
        System.out.println("This is mother print");
    }

    void show() {
        System.out.println(a); 
        System.out.println(super.a); // use to access parent class veriable name
        print();
        super.print();
    }
}

public class super1 {
    public static void main(String[] args) {
        Mother ob = new Mother();
        ob.show();
    }
}
