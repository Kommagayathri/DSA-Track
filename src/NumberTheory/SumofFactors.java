package NumberTheory;

public class SumofFactors {
    public static void main(String[] args) {
        int N = 36;
        System.out.println(NoOFfactors(N));
        System.out.println(SumofFact(N));

    }
    public static int  NoOFfactors(int N){
        int count =0;
        for(int i=1;i*i<=N;i++){
          if(N%i==0){
              if(i==N/i){
                  count++;
              }
              else {
                  count += 2;
              }
          }
        }
        return count;
    }

    public static int SumofFact(int N){
        int sum =0;
        for(int i=1;i*i<=N;i++){
            if(N%i==0){
                if(i==N/i){
                    sum +=i;
                }
                else {
                    sum +=i+N/i;
                }
            }
        }
        return sum;

    }
}
