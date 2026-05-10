package TLEsheet;

import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x= sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println(LineTrip(n,x,arr));
        }
    }
    public static int LineTrip(int n, int x, int[]arr){

       int maxGap=arr[0];
       for(int i=1;i<n;i++){
           maxGap=Math.max(maxGap,arr[i]-arr[i-1]);
       }
       // lastpoint to x

        int lastGap = 2*(x-arr[n-1]);
       return Math.max(maxGap,lastGap);

    }
}
