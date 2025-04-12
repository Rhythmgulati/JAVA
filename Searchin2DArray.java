import java.util.Arrays;

public class Searchin2DArray {

    public static int[] Search(int[][] arr, int target) {
        int r = 0;
        int c = arr[0].length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] { r, c };
            } else if (arr[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };
        // int[] index = Search(arr, 4);
        System.out.println(Arrays.toString(Search(arr, 5)));
    }
}
