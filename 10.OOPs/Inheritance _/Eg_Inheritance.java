

class mom{
    void dispaly(){
        System.out.println("This is parent class");
    }
}

class son extends mom{
    void show(){
        System.out.println("This is Child class");
    }
}

public class Eg_Inheritance {
    public static void main(String[] args) {
        son ob = new son();
        ob.show();
        ob.dispaly();
    }
}
