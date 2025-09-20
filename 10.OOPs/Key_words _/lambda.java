

interface exp {
    int op(int a, int b);
}

public class lambda {
    public static void main(String[] args) {
        exp add =(a,b) -> a+b;

        System.out.println(add.op(10,5));
    }    
}
