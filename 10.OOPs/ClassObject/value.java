class valueset{
    String name;
    int n;

    void display(){
        System.out.println(name);
        System.out.println(n);
    }

    void setvalue(String s, int b){
        name = s;
        n=b;
    }
}

public class value {
    public static void main(String[] args) {
        valueset a = new valueset();
        a.setvalue("Hello", 5);
        a.display();
    }
}
