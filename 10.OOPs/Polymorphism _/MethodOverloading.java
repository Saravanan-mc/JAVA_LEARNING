
class adds{

void add(int a, int b){
    System.out.println(a+b);
}

void add(float a, float b){
    System.out.println(a+b);
}

void add(String a, String b){
    System.out.println(a+b);
}

}
public class MethodOverloading {
    public static void main(String[] args) {
        adds a = new adds();
        a.add(5,5);
        a.add(5.5f,5.5f);
        a.add("a","b");
    }
}
