
package Problems;
import java.util.Scanner;

public class CountingDivisorsCSES {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=1000000;
        int[] Sieve = new int[1000001];
        for(int i=1;i<=N;i++) {
            for (int j = i; j <= N; j += i) {
                Sieve[j]++;
            }
        }
        long t=sc.nextLong();
        while(t-->0){
           long n= sc.nextLong();
            System.out.println(Sieve[(int)n]);
        }
    }

}
