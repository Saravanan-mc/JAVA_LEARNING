public class Explicit_Casting {
    public static void main(String[] args) {
        double d = 100.99;
        float f = (float)d;
        long l = (long)f;
        int i = (int)l;
        short s = (short)i;
        byte b = (byte)s;

        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);

        int ci = 66;
        char c = (char)ci;
        System.out.println(ci);
        System.out.println(c);
    }
}
