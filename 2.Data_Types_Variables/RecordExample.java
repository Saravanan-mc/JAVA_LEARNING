

record Point(int x, int y) { }

public class RecordExample {
    public static void main(String[] args) {
        Point p = new Point(5, 10);
        System.out.println("Point coordinates: x=" + p.x() + ", y=" + p.y());
    }
}
