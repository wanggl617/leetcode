package qujianDP;
import java.util.*;
public class Caishuzi2_375 {
    public static void main(String[] args) {

      System.out.println(getMoneyAmount(10));
    }
    public static int getMoneyAmount(int n) {
        int[][] dp = new int[n+2][n+2];
        for(int j = 2; j <=n; ++j){
            for(int i = j-1; i >= 1; --i){
                dp[i][j] = Integer.MAX_VALUE;
                for(int k = j; k >= i;--k){
                    //System.out.println("i:"+i+" j:"+j+" k:"+k);
                    int temp = Math.max(dp[i][k-1],dp[k+1][j]) + k;
                    dp[i][j] = Math.min(dp[i][j],temp);
                    //System.out.println(" dp:"+dp[i][j]);
                }
            }
        }
        return dp[1][n];
    }
}
