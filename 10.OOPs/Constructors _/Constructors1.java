class sample1{
    int a;
    int b;

    sample1(int a, int b){
        System.out.println("this is constructor it's was run auto it use to set default value");
        this.a=a;
        this.b=b;
    }
} 


public class Constructors1 {
    public static void main(String[] args) {
        sample1 ob = new sample1(10,15);
        System.out.println(ob.a);
        System.out.println(ob.b);
    }
}
