package TLEsheet;

import java.util.Scanner;

public class HalloumiBoxe {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int K= sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i]= sc.nextInt();
            }


            if (K > 1) {
                System.out.println("YES");
            } else {

                boolean sorted=true;
                for(int i=0;i<N-1;i++){
                    if(arr[i]>arr[i+1]){
                        sorted=false;
                        break;
                    }
                }
                System.out.println(sorted?"YES":"NO");
            }

        }


    }
}
