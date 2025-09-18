package Encapsulation;

public class PublicExample {
    public String name = "Alice";  // access any where 

    public void show() {
        System.out.println("Public Method: " + name);
    }

    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.show();  
    }
}
