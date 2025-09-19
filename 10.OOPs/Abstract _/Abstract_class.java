

abstract class computer{
    void on1(){
        System.out.println("the Computer is on");
    }
}

class hp extends computer{
    void on(){
        System.out.println("the Hp computer is on");
    }
}

public class Abstract_class{
    public static void main(String[] args) {
        hp ob = new hp();
        ob.on();
        ob.on1();
    }
}