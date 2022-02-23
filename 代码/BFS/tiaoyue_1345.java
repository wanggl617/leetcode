package BFS;
import java.util.*;
public class tiaoyue_1345 {
    public static void main(String[] args){
        tiaoyue_1345 test = new tiaoyue_1345();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            if("#".equals(str))break;
            String[] buf =  str.split(",");
            int[] arr = new int[buf.length];
            for(int  i = 0 ; i < buf.length; ++i)
                arr[i] = Integer.parseInt(buf[i]);
            System.out.println(test.minJumps(arr));
        }
        
    }
    public int minJumps(int[] arr) {
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        int ans = -1;
        for(int i = 0 ; i < arr.length; ++i){
            if(!map.containsKey(arr[i]))map.put(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        int N = arr.length;
        int[] mark = new int[N];
        Queue<Integer> que = new LinkedList<>();
        mark[0] = 1;
        que.offer(0);
        while(!que.isEmpty()){
            int size = que.size();
            ans++;
            for(int i = 0 ; i < size; ++i){
                int temp = que.poll();
                if(temp == arr.length-1)return ans;
                if(temp - 1 >= 0 && mark[temp-1] != 1){
                    que.offer(temp -1);
                    mark[temp-1]=1;
                }
                if(temp + 1 < arr.length && mark[temp+1] != 1){
                    que.offer(temp +1);
                    mark[temp+1] = 1;
                }
                if(map.containsKey(arr[temp])){
                    for(Integer idx : map.get(arr[temp])){
                        if(mark[idx]!= 1){
                            que.offer(idx);
                            mark[idx] = 1;
                        }
                    }
                    //关键一步，删除哈希表中已经遍历过的 键值对
                    map.remove(arr[temp]);
                }
            }
        }
        return -1;
    } 
}

