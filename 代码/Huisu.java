import java.util.*;
public class Huisu {
    
    public void backTrack(List<List<Integer>>ans,int n,List<Integer> path,int start,int k){
        if(path.size() == k ){
            ans.add(path);
            return;
        }
        for(int i = start; i <= n;++i){
            path.add(i);
            backTrack(ans, n, path, i+1, k);
            path.remove(i);
        }
    }
    public List<List<Integer>> combine(int n,int k){
        
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(ans, n, path, 1, k);
        return ans;
    }
}
