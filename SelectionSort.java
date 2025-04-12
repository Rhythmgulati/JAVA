import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 4, 2, 34, 5 };

        for (int i = arr.length - 1; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    int temp = arr[i];
                    arr[i] = max;
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
