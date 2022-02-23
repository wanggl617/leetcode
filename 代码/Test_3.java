import java.util.*;
public class Test_3 {
    private static final int[] dx = {0,0,-1,1};
    private static final int[] dy = {-1,1,0,0};
    static int flag = 0;
    public static void DFS(int x,int y,char[][] board,int[][] mark,int path,String word){
        if(path == word.length()){
            flag = 1;
            return;
        }
        for(int i = 0; i < 4;++i){
            int newx = x + dx[i];
            int newy = y + dy[i];
            if(newx < 0 || newy < 0 || newx == board.length || newy == board[0].length || mark[newx][newy]==1){
                continue;
            }          
            else if( board[newx][newy] == word.charAt(path)){         
                mark[newx][newy] = 1;
                DFS(newx,newy,board,mark,path+1,word);
                mark[newx][newy] = 0;
            }
        }
    }
    public static boolean exist(char[][] board, String word) {

        char c  = word.charAt(0);
        for(int i = 0; i < board.length;++i){
            for( int j = 0; j < board[0].length; ++j){
                if(board[i][j] == c){               
                    int[][] mark = new int[board.length][board[0].length];
                    mark[i][j] = 1;
                    DFS(i,j,board,mark,1,word);
                    if(flag == 1)return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word = "ABSF";
        char[][] board = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        Boolean ans = exist(board, word);
        System.out.println(ans);
    }
}
