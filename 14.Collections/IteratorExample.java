import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        System.out.println("List: " + list);

        Iterator<String> it = list.iterator();

        System.out.println("Traversing with Iterator:");
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);

            if (fruit.equals("Banana")) {
                it.remove();
            }
        }
        
        System.out.println("After Removing Banana: " + list);
    }
}
