

interface Father{
    void call();
    void talk();
}


interface Mother{
    void call();
    void talk();
}

class son implements Father,Mother{
    public void call(){
        System.out.println("calling ......");
    }

    public void talk(){
        System.out.println("Talking ......");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        son on = new son();
        on.call();
        on.talk();
    }      
}
