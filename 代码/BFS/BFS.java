package BFS;
import java.util.*;

public class BFS {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    public int[][] updateMatrix(int[][] mat) {
        
        int m = mat.length, n = mat[0].length;
        int[][] mark = new int[m][n];
        int[][] ans = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < m;++i){
            for(int j = 0;j < n;++j){
                if(mat[i][j] == 0){
                    queue.offer(new int[]{i,j});
                    mark[i][j] = 1;
                }
            }
        }
        while(!queue.isEmpty()){
            int temp[] = queue.peek();
            int x = temp[0];
            int y = temp[1];
            queue.poll();
            for(int i = 0;i < 4;++i){
                int newx = x + dx[i];
                int newy = y + dy[i];
                if(newx >= 0 &&  newx < m &&  newy >=0 && newy < n && mark[newx][newy] ==0 ){
                    
                    ans[newx][newy] = ans[x][y] + 1;
                    mark[newx][newy] = 1;
                    queue.offer(new int[]{newx,newy});
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        char[] c = {'a','b','c'};
        
        System.out.println(String.valueOf(c));
    }
}
