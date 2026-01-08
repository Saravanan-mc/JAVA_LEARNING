import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        list.stream()
                .filter(n-> n%2==0)
                .map(n->n*2)
                .forEach(n->System.out.print(n+" "));
        System.out.println();
        System.out.println("this is sum ");
        int sum = list.stream().reduce(0,Integer::sum);
        System.out.print(sum);
    }
}
