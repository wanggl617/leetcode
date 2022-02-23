package BFS;
import java.util.*;
class duomiruo_838{
    public String pushDominoes(String dominoes) {
        int N = dominoes.length();
        int[] mark =  new int[N];
        char[] chs = dominoes.toCharArray();
        Deque<int[]> dq = new ArrayDeque<>();
        for(int i = 0 ;i < N ; ++i){
            //将初始的有受力的加入队列
            if(chs[i] == 'L'){
                dq.addLast(new int[]{i,1,-1});
                mark[i] = 1;
            }
            if(chs[i] == 'R'){
                dq.addLast(new int[]{i,1,1});
                mark[i] = 1;
            }
        }
        while(!dq.isEmpty()){
            int[] temp  = new int[3];
            temp = dq.pollFirst();
            //loc 新的位置
            int loc = temp[0] + temp[2];
            if(loc < 0 || loc >= N)continue;
            //首次受力 mark[loc] == 0 ;
            if(mark[loc] == 0){
                mark[loc] = temp[1] + 1;
                dq.addLast(new int[]{loc, mark[loc],temp[2]});
                chs[loc] = temp[2] == -1?'L':'R';
            }
            //多次受力 mark[loc] != 0, 当mark[loc] == temp[1] + 1时，说明同一时间收到两个力
            else if(mark[loc] == temp[1] + 1){
                chs[loc] = '.';  
            }
        }
        return String.valueOf(chs);
    }
}
