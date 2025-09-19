

class num{
    int a,b;
    void setfun(int a, int b){
        this.a=a;
        this.b=b;
    }

    void print(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class ThisKey {
    public static void main(String[] args) {
        num ob = new num();
        ob.setfun(10,20);
        ob.print();
    }    
}
