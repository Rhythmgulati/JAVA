public class MaxScoreonSplitting {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 1 };
        int sum = 0, max = -2;

        for (int i = 0; i < arr.length; i++) {
            int countzeros = 0, countones = 0;
            for (int j = 0; j <= i; j++) {
                if (arr[j] == 0) {
                    countzeros += 1;
                }

            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == 1) {
                    countones += 1;
                }
            }

            sum = countones + countzeros;

            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

}
