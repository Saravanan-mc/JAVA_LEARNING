
class animal{
    void eat(){
        System.out.println("Eating ......");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("Barking ......");
    }
}

class puppy extends dog{
    void weep(){
        System.out.println("Weeping ......");
    }
}


public class MultilevelInheritance {
    public static void main(String[] args) {
        puppy ob = new puppy();
        ob.weep();
        ob.bark();
        ob.eat();
    }
}
