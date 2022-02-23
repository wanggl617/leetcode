import java.util.*;
public class Qujian {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,new Comparator<>(){
            public int compare(int[]a,int[]b){
                return a[0]-b[0];
            }
        });
        int left  = intervals[0][0];
        int right = intervals[0][1];
        for(int i  = 1;i < intervals.length; ++i){
            if(intervals[i][0] <= right){
                right = Math.max(right,intervals[i][1]);
            }else{
                ans.add(new int[]{left,right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
        }
        ans.add(new int[]{left,right});
        return ans.toArray(new int[ans.size()][]);
    }
}
