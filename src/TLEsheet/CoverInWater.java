package TLEsheet;

import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine(); // consume newline

        while (t-- > 0) {

            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            String s = sc.nextLine();

            int count = 0;
            int ans = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '.') {
                    count++;
                    ans++;
                    if (count==3) {
                        System.out.println(count-1);
                       break;
                    }
                } else {
                    count = 0;
                }
            }
            if(count<3) {
                System.out.println(ans);
            }


        }
    }
}
