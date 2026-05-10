package TLEsheet;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class DoremysPaint {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            String ans=findsol(arr,n);
            System.out.println(ans);
        }
        sc.close();
    }

    static String findsol(int arr[],int n)
    {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }

        if(map.size() > 2) return "No";
        else
        {
            for(int key : map.keySet())
            {
                int freq=map.get(key);
                if(freq  < n/2) return "No";
            }
        }
        return "Yes";

    }
}
