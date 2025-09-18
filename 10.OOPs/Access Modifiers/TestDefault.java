class DefaultExample {
    String city = "Chennai";  // default

    void display() {          // default
        System.out.println("City: " + city);
    }
}

public class TestDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.display();       
    }
}
