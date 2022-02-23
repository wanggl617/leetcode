package qujianDP;

import java.util.Scanner;

public class zuichang_huiwenzixulie_516 {
    //516.最长回文子序列  区间DP
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(longestPalindromeSubseq(s));
        }
      
    }
    public static int longestPalindromeSubseq(String s) {

        //dp[i][j]  ： s[i.....j] 最长回文子序列的长度
        /**
         * s[i] == s[j] : dp[i][j] = dp[i+1][j-1] + 2
         * s[i] ！= s[j] : dp[i][j] = max(dp[i+1][j] , dp[i][j-1])
         * 
         * 边界条件： dp[i][i] = 1;
         */
        int N = s.length();
        int[][] dp  =  new int[N][N];
        for(int i = N-1; i >= 0 ; --i){
            dp[i][i] = 1;
            for(int j = i+1; j < N;++j){
                if(s.charAt(i)==s.charAt(j))
                    dp[i][j] =  dp[i+1][j-1] + 2;
                else 
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[0][N-1];
    }
}
