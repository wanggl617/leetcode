package DP;
import java.util.*;
public class fengezifuchaun2_132 {
    //132.分割回文串二 dp
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()){
          String str = sc.nextLine();
          System.out.println(minCut(str));
      }
    }
    public static int minCut(String s){
        int N = s.length();
        boolean[][]  mark = new boolean[N][N];
        int[] ans = new int[N];
        ans[0] = 0;
        for(int i = 0; i < mark.length; ++i) {
            Arrays.fill(mark[i],true);
        }
        for(int i = N-1; i >= 0; --i){
            for(int j = i+1; j < N;++j){
                mark[i][j] = s.charAt(i) == s.charAt(j) && mark[i+1][j-1];
            }
        }
        for(int i = 1; i < N;++i){
            ans[i] = Integer.MAX_VALUE;
            for(int j = 0;j <= i; ++j ){
                
                if(mark[j][i]){
                    if(j == 0){
                        ans[i] = 0;
                        break;
                    }
                    ans[i] = Math.min(ans[i],ans[j-1]+1);
                }
            }
        }
        return ans[N-1] ;
    }
}
