public class StringBuilder_Basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);

        sb.insert(6,"java");
        System.out.println(sb);

        sb.replace(6,10,"c++");
        System.out.println(sb);

        sb.delete(6,10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
