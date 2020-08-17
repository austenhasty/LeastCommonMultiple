import java.util.Scanner;

public class LeastCommonMultiple {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextInt();
        long b = s.nextInt();
        System.out.println(leastCommonMultiple(a, b));
    }

    public static long leastCommonMultiple(long a, long b) {
        for (long i = 1; i <= a*b; i++) {
            if (i%a == 0 && i%b == 0) {
                return i;
            }
        }
        return a*b;
    }
}
