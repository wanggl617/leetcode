import java.util.*;
public class Huadong {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans  =new ArrayList<>();
        char[] s1 = s.toCharArray();
        Integer[] p1 = new Integer[26]; 
        for(int i = 0;i < p.length();++i){
            char c = p.charAt(i);
            p1[c-'a']++;
        }
        Arrays.sort(p1);
        int left =0;
        int num = p.length() -1;
        while(left < s.length()-num){
            if(p1[s1[left]-'a']!=0){
            //这个字符在p 中
               Integer[] temp  = new Integer[26];
               int cnt = p.length();
               int i  = left;
               while(cnt-- > 0){
                    temp[s1[i]-'a']++;
                    i++;
               }
               if(Arrays.equals(temp, p1)){
                   ans.add(left);
               }
            }
            left++;
        }
        return ans;
    }
}
