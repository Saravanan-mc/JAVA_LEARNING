public class Array_Basics {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50}; 
        int[] arr2 = new int[5]; 
        arr2[0] = 100;
        arr2[1] = 200;

        System.out.println(arr1[0]);
        System.out.println(arr2[1]);
        System.out.println(arr1.length); //length of the array
    }
}
