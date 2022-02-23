import java.util.*;

public class IPO {
    public static void main(String[] args) {
        int ans = findMaximizedCapital(2,0,new int[]{1,2,3},new int[]{0,1,1});
        System.out.println(ans);
    }
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n  = profits.length;
        int cur = 0;
        int cap_pro[][] = new int[n][2];
        for(int i  = 0;i < n;++i){
            cap_pro[i][0] = capital[i];
            cap_pro[i][1] = profits[i]; 
        }
        Arrays.sort(cap_pro,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x,y)->y-x);
        for(int i = 0;i < k;++i){
            
            while( cur < n && w >= cap_pro[cur][0]){
                maxHeap.add(cap_pro[cur][1]);
                cur++;
            }
            System.out.println("____________");
            if(!maxHeap.isEmpty()){
                w += maxHeap.peek();
                maxHeap.poll();
            }else{
                break;  
            }
        }

        return w;
    }
}
