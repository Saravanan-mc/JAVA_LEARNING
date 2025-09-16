public class Variable_Scope {
    int instanceVar = 100;  // instance variable
    static String staticVar = "I am static"; // static variable

    public static void main(String[] args) {
        int localVar = 50; // local variable
        System.out.println(localVar);
        System.out.println(staticVar);

        Variable_Scope obj = new Variable_Scope();
        System.out.println(obj.instanceVar);

        for(int i = 1; i <= 3; i++) { // block scope variable
            int blockVar = i * 10;
            System.out.println(blockVar);
        }
    }
}
