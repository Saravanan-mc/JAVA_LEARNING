class Student {
    private String name;
    private int age;

    public void set1(String name, int n) {
        this.name = name;
        this.age=n;
    }


    void get1(){
        System.out.println(name);
        System.out.println(age);
    }
  
}

public class EncapsulationExample {
    public static void main(String[] args) {

        Student ob = new Student();
        ob.set1("Hello",20);

        ob.get1();
    }
}
