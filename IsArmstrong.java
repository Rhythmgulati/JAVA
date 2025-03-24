public class IsArmstrong {
    public static void main(String[] args) {
        boolean result = IsArmstrongfunc(153);
        if (result) {
            System.out.println("number is armstrong");
        } else {
            System.err.println("num is not armstong");
        }
    }

    public static boolean IsArmstrongfunc(int a) {
        int num, rem, sum = 0;
        num = a;
        while (num > 0) {
            rem = num % 10;
            System.out.println(rem);
            sum += rem * rem * rem;
            num /= 10;
            System.out.println(num);
        }
        System.out.println(sum);
        if (sum == a) {
            return true;
        } else {
            return false;
        }
    }
}
