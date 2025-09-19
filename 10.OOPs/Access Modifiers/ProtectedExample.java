

class Animal {
    protected String type = "Dog";

    protected void sound() {
        System.out.println("Bark");
    }
}

public class ProtectedExample extends Animal { // after see Inheritance then learn this 
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println(obj.type);
        obj.sound();
    }
}
