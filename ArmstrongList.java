public class ArmstrongList {
    public static void main(String[] args) {
        for (int i = 0; i < 300; i++) {
            boolean result = IsArmstrongfunc(i);
            if (result) {
                System.out.println(i);
            }
        }
    }

    public static boolean IsArmstrongfunc(int a) {
        int num, rem, sum = 0;
        num = a;
        int digit = String.valueOf(num).length();

        while (num > 0) {
            rem = num % 10;
            // System.out.println(rem);
            sum += Math.pow(rem, digit);
            num /= 10;
            // System.out.println(num);
        }
        // System.out.println(sum);
        if (sum == a) {
            return true;
        } else {
            return false;
        }
    }
}
