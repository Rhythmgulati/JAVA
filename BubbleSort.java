import java.util.Arrays;

public class BubbleSort {

    public static int[] bbsort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 3, 2, 5, 6, 7 };
        System.out.println(Arrays.toString(bbsort(arr)));

    }
}
