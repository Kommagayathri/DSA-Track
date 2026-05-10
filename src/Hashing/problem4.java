package Hashing;
import java.util.HashMap;
import java.util.Map;

public class problem4 {

        public static void main(String[] args) {
            int[] arr={1,1,3,1,2,3};
            int k =2;
            Distance(arr,k);
        }
        public static void Distance(int[] arr,int k){
            Map<Integer,Integer> map = new HashMap<>();

            for(int i=0;i<arr.length;i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)-i);
            }
            for(Map.Entry<Integer,Integer> num:map.entrySet()){
                int val = num.getValue();
                int key = num.getKey();
                if(val<=k){
                    System.out.println(key);
                }
            }

        }

}
