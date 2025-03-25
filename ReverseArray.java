import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 3, 2, 1, 3, 6 };
        printarr(arr);

        // 1
        // for (int i = 0; i < arr.length / 2; i++) {
        // for (int j = arr.length - 1 - i; j >= arr.length / 2; j--) {
        // // 0 1 2 3
        // // 6 5 4 3
        // System.out.println(arr.length);
        // swap(arr, i, j);
        // break;
        // }
        // }

        // 2
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

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
