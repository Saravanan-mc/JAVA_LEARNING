public class Advanced_Switch {
    public static void main(String[] args) {
        String fruit = "Apple";

        switch(fruit) {
            case "Mango", "Banana" -> System.out.println("Tropical Fruit");
            case "Apple", "Orange" -> System.out.println("Temperate Fruit");
            default -> System.out.println("Other Fruit");
        }

        int day = 3;
        String dayName = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            default -> "Other Day";
        };
        System.out.println(dayName);
    }
}
