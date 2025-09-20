
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);

        System.out.println("All days:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
