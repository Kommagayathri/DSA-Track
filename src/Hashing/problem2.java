package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class problem2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =6;
        System.out.println(PrintPair(arr,k));
        System.out.println(CountPair(arr,k));
    }
     static ArrayList<Integer> PrintPair(int[] arr , int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
         ArrayList<Integer> list = new ArrayList<>();
         for (int i = 0; i < arr.length; i++) {
             int temp = k - arr[i];
             if (map.containsKey(temp)) {
                 list.add(map.get(temp));
                 list.add(i);
             }
             map.put(arr[i], i);
         }
         return list; // if you want to add more pairs( in form of pairs structure not like single list values) then you can do 2d list

     }
         static int CountPair(int[] arr , int k){
             HashMap<Integer,Integer> map = new HashMap<>();
             int count =0;
             for(int i=0;i<arr.length;i++){
                 int temp =k-arr[i];
                 if(map.containsKey(temp)){
                    count++;
                 }
                 map.put(arr[i],i);
             }
             return count;
    }
}
