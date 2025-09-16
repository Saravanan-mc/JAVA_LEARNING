import java.util.Arrays;

public class Arrays_Methods {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 3); //after sort the array become 1,2,3,5,8
        System.out.println(index);

        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copy));

        int[] rangeCopy = Arrays.copyOfRange(arr, 2, 4);
        System.out.println(Arrays.toString(rangeCopy));

        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.equals(arr, copy));
    }
}
