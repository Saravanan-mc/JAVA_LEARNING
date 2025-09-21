import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1); arr.add(2); arr.add(0,3); arr.add(3); arr.add(4); arr.add(5);
        System.out.println(arr);

        System.out.println(arr.get(1));

        arr.remove(0);
        System.out.println(arr);

        arr.set(2,3);
        System.out.println();


        System.out.println(arr.contains(1));
        System.out.println(arr.contains(3));

        System.out.println(arr.size());

        System.out.println(arr.isEmpty());

        System.out.println(arr.indexOf(4));

        System.out.println(arr.lastIndexOf(3));


        for(int n:arr) System.out.print(n+" ");
        System.out.println();


        // reverse
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.reverse(arr1);
        System.out.println(arr1);

        Collections.sort(arr1);
        System.out.println(arr1);

        Collections.shuffle(arr1);
        System.out.println(arr1);

        Collections.sort(arr1, Collections.reverseOrder());
        System.out.println(arr1);

    }    
}