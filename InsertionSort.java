import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 5, 3, 2, 4, 5, 10, 34 };

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            if (arr[i] < arr[i - 1]) {

                for (int j = i - 1; j > 0; j--) {
                    if (arr[j] > key) {
                        arr[j + 1] = arr[j];
                        arr[j] = key;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
