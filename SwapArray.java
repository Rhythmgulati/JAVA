
// import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 6, 7, 10 };
        printarr(arr);
        swap(arr, 3, 5);
        printarr(arr);
    }

    public static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void printarr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
