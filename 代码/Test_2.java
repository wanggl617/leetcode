import java.util.*;
public class Test_2 {
    static List<String> ans = new ArrayList<>();
    public static void backTrack(Map<Character,String> map,String digits,StringBuilder  path,int start){
        if(start == digits.length()){
            ans.add(path.toString());
            return;
        }
        char c = digits.charAt(start);
        String temp = map.get(c);
        //System.out.println(temp);
        for(int i = 0; i < temp.length();++i){
            char ch = temp.charAt(i);
            path.append(ch);
            backTrack(map,digits,path,start+1);
            path.deleteCharAt(path.length() - 1);
        }   
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<>();
        Map<Character,String> map = new HashMap<>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
            }   
        };
        StringBuilder  path  = new StringBuilder();
        backTrack(map,digits,path,0);
        return ans;
    }

    
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String digits = "23";
        ans = letterCombinations(digits);
        for(String str:ans){
            System.out.println(str);
        }
    }
}
