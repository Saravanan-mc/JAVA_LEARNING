public class String_Comparison {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2); // true, same reference
        System.out.println(s1.equals(s3)); // true, same content, it's used in lot of problems
        System.out.println(s1.equalsIgnoreCase("java")); // true, ignoring case
    }
}
