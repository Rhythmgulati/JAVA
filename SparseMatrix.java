public class SparseMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 3, 0 }, { 0, 1, 0, 0 }, { 0, 20, 0, 0 }, { 0, 0, 0, 6 } };

        int sprow = 0;
        int nonZeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    nonZeroCount++;
                }
            }
        }

        int[][] sparr = new int[nonZeroCount][3];

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    sparr[sprow][0] = i;
                    sparr[sprow][1] = j;
                    sparr[sprow][2] = arr[i][j];
                    sprow++;
                }
            }
        }
        for (int i = 0; i < sparr.length; i++) {
            for (int j = 0; j < sparr[i].length; j++) {
                System.out.print(sparr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
