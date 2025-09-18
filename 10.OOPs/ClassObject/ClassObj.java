package ClassObject;
class person{ //class
    String name; //object 1
    int age; //object 2

    void display(){
        System.out.println(name+"\n"+age);
    }
}
public class ClassObj{
    public static void main(String[] args){
        person obj = new person(); // create object 
        obj.name="Hello";
        obj.age=19;
        obj.display();
    }
}