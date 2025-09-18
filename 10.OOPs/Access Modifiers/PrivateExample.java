class PrivateExample {
    private int age = 21; // private access in the method

    private void secret() {
        System.out.println("Private Method"); 
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println(obj.age);  
        obj.secret();                 
    }
}
