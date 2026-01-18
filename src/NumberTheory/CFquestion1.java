package NumberTheory;
import java.util.*;
public class CFquestion1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long N = sc.nextLong();
            System.out.println(ProductOf3Num(N));
        }

        sc.close();
    }

    public static String ProductOf3Num(long N) {
        long a = 0, b = 0, c =0;
        long n = N;

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {

                if (a == 0) {
                    a = i;
                    n /= a;
                }
                else if (b == 0 && i != a) {
                    b = i;
                    n /= b;
                    break;   // important
                }
            }
        }

        c = n;

        if (a > 1 && b > 1 && c > 1 && a != b && b != c && a != c) {
            return "YES\n" + a + " " + b + " " + c;
        }

        return "NO";
    }

}
