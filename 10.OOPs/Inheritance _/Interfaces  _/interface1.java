

interface Father{
    void call();
    void talk();
}

class inter implements Father{
    public void call(){
        System.out.println("calling ......");
    }

    public void talk(){
        System.out.println("Talking ......");
    }
}

public class interface1 {
    public static void main(String[] args) {
        inter on = new inter();
        on.call();
        on.talk();
    }      
}
