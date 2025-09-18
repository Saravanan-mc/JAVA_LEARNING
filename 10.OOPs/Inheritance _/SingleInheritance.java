

class mom1{
    void dispaly(){
        System.out.println("This is parent class");
    }
}

class son1 extends mom1{
    void show(){
        System.out.println("This is Child class");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        son1 ob = new son1();
        ob.show();
        ob.dispaly();
    }
}
