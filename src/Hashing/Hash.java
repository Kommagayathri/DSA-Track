package Hashing;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("rinkhu", 99);
        map.put("sachin",100);
        map.put("tillu",98);

        System.out.println(map.get("sachin"));
    }
}
