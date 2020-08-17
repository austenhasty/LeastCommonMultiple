import java.util.Scanner;

public class LeastCommonMultiple {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(leastCommonMultiple(a, b));
//        System.out.println(greatestCommonDivisor(a, b));
    }

/*    public static long leastCommonMultiple(long a, long b) {
        for (long i = 1; i <= a*b; i++) {
            if (i%a == 0 && i%b == 0) {
                return i;
            }
        }
        return a*b;
    } */

    public static long leastCommonMultiple(int a, int b) {
        return (long) (a *(b / greatestCommonDivisor(a,b)));
    }

    public static long greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a%b);
        }

    }
}
