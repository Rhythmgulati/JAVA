public class PrimeList {
    public static void main(String[] args) {
        boolean IsPrime = true;
        for (int i = 2; i < 100; i++) {
            IsPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    IsPrime = false;
                    break;
                }
            }
            if (IsPrime) {
                System.out.println(i);
            }
        }
    }
}
