package DFS;
import java.util.*;
public class dancisousuo_19 {
    private boolean[][] vis;
    private int[] dx = new int[]{0,0,1,-1};
    private int[] dy = new int[]{1,-1,0,0};
    public dancisousuo_19(){

    }
    public boolean DFS(int x,int y,char[][] board,String word,int path){
        if(path == word.length()-1){
            return true;
        }
        vis[x][y] = true;
        for(int i = 0 ; i < 4; ++i){
            int newx = x + dx[i];
            int newy = y + dy[i];
            if(newx < 0 || newy < 0 || newx == board.length || newy == board[0].length || vis[newx][newy])
                continue;
            else if(word.charAt(path+1) == board[newx][newy] && DFS(newx,newy,board,word,path+1))
                return true;
        }
        vis[x][y] = false;
        return false;
    }
    public  boolean exist(char[][] board, String word) {
        int M =board.length, N = board[0].length;
        vis = new boolean[M][N];
        for(int i = 0 ; i < M ; ++i){
            for(int j = 0; j < N ; ++j){
                if(word.charAt(0) == board[i][j] && DFS(i,j,board,word,0))return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word  = "ABCCED";
        dancisousuo_19 test = new dancisousuo_19();
        System.out.println(test.exist(board, word));
    }
}
