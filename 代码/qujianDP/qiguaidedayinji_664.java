package qujianDP;

public class qiguaidedayinji_664 {
    //题解
    //https://leetcode-cn.com/problems/strange-printer/solution/qi-guai-de-da-yin-ji-by-leetcode-solutio-ogbu/
    public static void main(String[] args) {
      String s ="aaabbaaaba";
      System.out.println(strangePrinter(s));
    }
    
    public static int strangePrinter(String s) {
        int N = s.length();
        int[][] dp = new int[N][N];
        for(int i = 0; i < N; ++i ){
            dp[i][i] = 1;
        }
        for(int j = 1; j < N; ++j){
            for(int i = j-1; i >= 0;--i){
                if( s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i][j-1];
                }
                else{
                    dp[i][j] = Integer.MAX_VALUE;
                    for(int k = i; k < j; ++k ){
                        dp[i][j] = Math.min(dp[i][j],dp[i][k]+dp[k+1][j]);
                    }
                }
            }
        }
        return dp[0][N-1];
    }

}
