public class String_Methods {
    public static void main(String[] args) {
        String text = "Hello Java";

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.charAt(0));
        System.out.println(text.substring(6));
        System.out.println(text.contains("Java"));
        System.out.println(text.replace("Java", "World"));
    }
}
