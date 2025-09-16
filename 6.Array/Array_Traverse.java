public class Array_Traverse {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};

        for(int i = 0; i < arr.length; i++) 
            System.out.println(arr[i]);

        for(int x : arr) 
            System.out.println(x);

        int i = 0;
        while(i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }
}
