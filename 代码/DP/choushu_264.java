package DP;

import java.util.*;

public class choushu_264 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0;
        for(int i = 1; i < n ;++i){
            dp[i] =  Math.min(dp[p2]*2, Math.min(dp[p3]*3,dp[p5]*5));
            if(dp[i] == dp[p2]*2)p2++;
            if(dp[i] == dp[p3]*3)p3++;
            if(dp[i] == dp[p5]*5)p5++;
        }
        return dp[n-1];
    }
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> buf = new HashMap<>();
        int ans = 1;
        int left = 0, right = 0;
        for(int i = 0 ; i < s.length(); ++i){
            char c = s.charAt(i);
            if(buf.containsKey(c)){
                buf.put(c, 1);
                right++;
                
            }else{
                while(left < right && s.charAt(left)!=c){
                    
                    buf.remove(s.charAt(left));
                    ++left;
                }
                left++;
                right++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
