public class String_IndexOf {
    public static void main(String[] args) {
        String str = "Hello Java World";

        System.out.println(str.indexOf('J'));     
        System.out.println(str.indexOf("World")); 
        System.out.println(str.indexOf('o'));     
        System.out.println(str.indexOf('o', 5));  
        System.out.println(str.lastIndexOf('o')); 
    }
}
