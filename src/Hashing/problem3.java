package Hashing;

import java.util.HashMap;
//prefix sum and hashmap
public class problem3 {
    public static void main(String[] args) {
     int[] arr ={2,3,5,6,7,10};
     int k =10;
        System.out.println(CountSubarray(arr,k));
    }
    static int CountSubarray(int[] arr , int k ){

       // brute force using 2 loops
       int count =0;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
               sum += arr[j];
               if(sum==k){
                   count++;
               }

            }
        }
        return count;
    }

// Optimal Solution using hashmap
//    static int CountSubarray2(int[] arr , int k ){
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//
//    }
}
