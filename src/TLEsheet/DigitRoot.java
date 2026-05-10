package TLEsheet;
import java.util.Scanner;
public class DigitRoot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long K = sc.nextLong();
            long N= sc.nextLong();
            System.out.println(9*(K-1)+N);
        }

    }


}
