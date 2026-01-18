package NumberTheory;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class SOJfindTheKthPRIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            System.out.println(KthPrime(N));
        }
    }
    public static int KthPrime(int N){

         boolean[] Sieve = new boolean[90000000 ];
        ArrayList<Integer> primes =new ArrayList<>();// store primes


        for(int i=2;i*i<Sieve.length;i++){
            if(!Sieve[i]) {



                for (int j = i * i; j < Sieve.length; j += i) {
                    Sieve[j] = true;
                }
            }

        }

        for(int i=2;i<Sieve.length;i++){
           if(Sieve[i]==false){
               primes.add(i);
           }

        }





        return primes.get(N-1);
    }
}
