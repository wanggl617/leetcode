package qujianDP;
import java.util.*;
public class Shiziyouzi_877 {
    //题解：
    //https://leetcode-cn.com/problems/stone-game/solution/ji-yi-hua-di-gui-dong-tai-gui-hua-shu-xue-jie-java/
    public static void main(String[] args) {
      int[] piles = {5,3,4,5};
      System.out.println(stoneGame(piles));
    }
    public static boolean stoneGame(int[] piles) {
        int N = piles.length;
        int[][] dp  = new int[N][N];
        for(int i = 0 ; i < N; ++i){
            dp[i][i] =  piles[i];
        } 

        for(int j = 1; j < N; ++j){
            for(int i = j -1; i >= 0; --i){
                dp[i][j] = Math.max(piles[i] - dp[i+1][j],piles[j]-dp[i][j-1]);
                System.out.println("i:"+i+" j:"+j+" dp:"+dp[i][j]);
            }
        }
        return dp[0][N-1]>=0;
    }
}
