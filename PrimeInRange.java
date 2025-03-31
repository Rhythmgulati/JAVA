import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end;
        boolean IsPrime = true;
        start = sc.nextInt();
        end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (i < 2)
                continue;
            IsPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    IsPrime = false;
                    break;
                }
            }
            if (IsPrime == true) {
                System.out.println(i);
            }
        }
    }
}
