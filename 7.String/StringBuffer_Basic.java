public class StringBuffer_Basic {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println(sb);

        sb.insert(6, "Java ");
        System.out.println(sb);

        sb.replace(6, 10, "C++");
        System.out.println(sb);

        sb.delete(6, 9);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity()); 
        System.out.println(sb.length());   

        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
    }
}
