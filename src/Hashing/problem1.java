package Hashing;

import java.util.HashMap;

public class problem1 {
    public static void main(String[] args) {
        int [] arr = {1,1,3,2,3,2,8};
        Frequency(arr);
    }
    static void Frequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        //traverse the map

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxfreqNum = -1;
        int minfreqNum = -1;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq > maxFreq) {
                maxFreq = freq;
                maxfreqNum = key;
            }
            if (freq < minFreq) {
                minFreq = freq;
                minfreqNum = key;
            }
        }

        System.out.println("Max Freq Num =" + maxfreqNum + "->" + maxFreq);
        System.out.println("Min Freq Num =" + minfreqNum + "->" + minFreq);

    }
}
