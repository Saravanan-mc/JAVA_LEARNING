

abstract class computer1{
    abstract void off();
    void on1(){
        System.out.println("the Computer is on");
    }
}

class hp1 extends computer1{
    void on(){
        System.out.println("the Hp computer is on");
    }

    void off(){
        System.out.println("The computer is off");
    }
}

public class Abstract_Methods{
    public static void main(String[] args) {
        hp1 ob = new hp1();
        ob.on();
        ob.on1();
        ob.off();
    }
}