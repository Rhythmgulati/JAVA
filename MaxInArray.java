import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 3, 2, 34, 5, 7, 5, 4 };
        printArr(arr);
        int max = maxfunc(arr);
        System.out.println("Max element is - " + max);

    }

    public static void printArr(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    public static int maxfunc(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}