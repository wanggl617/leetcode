package DP;
import java.util.*;
public class zhili_2140 {
    public static void main(String[] args){
        
    }
    public long mostPoints(int[][] questions) {
        long ans = 0;
        int len = questions.length;
        long[] dp = new long[len+1]; // 做到第 i 题时可获得的最大得分
        for(int i = 0 ; i < len; ++i){
            if(i < len-1){
                //这题不做，直接顺位下一题
                dp[i+1] = Math.max(dp[i],dp[i+1]);
            }
            int next = i + questions[i][1] + 1;
            //这题做，i~next之间的题都不能做；
            dp[i] += questions[i][0];
            if(next < len){
                //这题做的话，到next时，已有最大得分dp[i]；
                dp[next] = Math.max(dp[next],dp[i]);
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
