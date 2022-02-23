package DP;
import java.util.*;
public class fengezifuhcuan_131 {
    //131.分割回文串  dp+回溯
    public static void main(String[] args) {
        String s = "abbab";
        List<List<String>> ans = partition(s);
        System.out.println(ans.size());
        for(int i = 0 ;i < ans.size();++i){
            List<String> temp = ans.get(i);
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
        }
      
    }
    private static List<List<String>> partition(String s) {
        int N = s.length();
        List<List<String>> ans = new ArrayList<>();
        boolean[][] dp = new boolean [N][N];
        for(int i =0 ; i < N ;++i){
            Arrays.fill(dp[i], true);
        }

        for(int i = N-1 ; i >= 0; --i){
            for(int j = i+1; j < N ;j++){
                dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]); 
            }
        }
        //回溯：
        dfs(ans, new ArrayList<String>(), dp, s, 0);

        return ans;

    }
    private static void dfs(List<List<String>> ans ,List<String> path,boolean[][] dp,String s, int start){
        if(start == s.length()){
            ans.add(new ArrayList<>(path));
        }
        for(int i = start; i < s.length(); ++i ){
            if(dp[start][i]){
                path.add(s.substring(start, i+1));
                dfs(ans, path, dp, s, i+1);
                path.remove(path.size()-1);
            }
        }
    } 
}
