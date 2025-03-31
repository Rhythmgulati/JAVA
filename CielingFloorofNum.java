public class CielingFloorofNum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 9, 12 };
        int target = 5;
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Cieling--" + arr[start]);

        System.out.println("Floor--" + arr[end]);

    }
}