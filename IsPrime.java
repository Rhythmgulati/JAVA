public class IsPrime {

    public static void main(String[] args) {
        boolean result = IsPrimefunc(3);
        if (result) {
            System.out.println("Yes num is prime");
        } else {
            System.out.println("No num is not prime");

        }
    }

    public static boolean IsPrimefunc(int a) {
        if (a < 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;

    }
}
