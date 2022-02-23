package DP;

import java.util.*;

public class zuidapingjunzhihe_813 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()){
          String str = sc.next().toString();
          String[] temp = str.split(",");
          int[] arr = new int[temp.length];
          for(int  i = 0; i < temp.length; ++i){
              arr[i] = Integer.parseInt(temp[i]);
          }
          int k  = sc.nextInt();
          System.out.println(largestSumOfAverages(arr, k));
      }
    }
    
    public static double largestSumOfAverages(int[] nums, int k) {

        int N = nums.length;
        double[][] dp = new double[N+1][k+1];
        //dp[i][k] : 前 i 个数，分成 k 组

        double[] sums = new double[N+1];
        for(int i = 0; i < N; ++i ){
            sums[i+1] = sums[i] + nums[i];
            dp[i+1][1] = sums[i+1]/(i+1);
        }
        Arrays.fill(dp[0],0);

        for(int i = 1; i <= N; ++i){
            for( int j = 2; j <= k; ++j ){
                dp[i][j] = 0;
                for(int idx = 0; idx < i; ++idx){
                    dp[i][j] = Math.max(dp[i][j], dp[idx][j-1] + (sums[i] - sums[idx])/(i-idx));
                }
            }
        }
        return dp[N][k];
    }
    
}
