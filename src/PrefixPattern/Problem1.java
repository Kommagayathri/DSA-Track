package PrefixPattern;

public class Problem1 {
    public static void main(String[] args) {
        //Range Sum Query
        int[] arr = {2,3,5,2,-5,1,4};
        int start = 1;
        int end = 6;
        System.out.println(RangeSumQuery(arr,start,end));
        int[][] arr2 = {{3,0,1,4,2},
                {5,6,3,2,1},
                {1,2,0,1,5},
                {4,1,0,1,7},
                {1,0,3,0,5}

        };
        int r1=2;
        int  c1=1;
        int r2=4;
        int c2=3;
        System.out.println(RangeSum2D(arr2,r1,c1,r2,c2));

    }
    static int RangeSumQuery(int[] arr, int start, int end){

        int[] prefixsum_arr = new int[arr.length];
        prefixsum_arr[0] = arr[0];
        for(int i=1;i<arr.length;i++){

            prefixsum_arr[i] =prefixsum_arr[i-1]+arr[i];

            if (start == 0) {
                return prefixsum_arr[end];
            }
        }
        int result = prefixsum_arr[end]-prefixsum_arr[start-1];
        return result;
    }

    // Range Sum Query 2D

    static int RangeSum2D(int[][]arr ,int r1,int c1,int r2, int c2){

        int[][] prefixSum = new int[arr.length][arr[0].length];

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int top = (i>0)?prefixSum[i-1][j]:0;
                int left = (j>0)?prefixSum[i][j-1]:0;
                int topleft =(i>0)&&(j>0)?prefixSum[i-1][j-1]:0;
                prefixSum[i][j]=arr[i][j]+top+left-topleft;
            }
        }

        int total =prefixSum[r2][c2];
        int top = (r1>0)?prefixSum[r1-1][c2]:0;
        int left=(c1>0)?prefixSum[r2][c1-1]:0;
        int topleft =(r1>0&&c1>0)?prefixSum[r1-1][c1-1]:0;
        return total-top-left+topleft;
    }
}
