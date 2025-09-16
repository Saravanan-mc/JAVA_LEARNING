class Nested_If_Else {
    public static void main(String[] args){
        int a = 10, c = 15, d = 20;
        if(d > a) {
            if(d > c)
                System.out.println("d is the greatest");
            else
                System.out.println("c is greater than d");
        } else {
            System.out.println("a is greater than d");
        }
    }
}