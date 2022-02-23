import java.util.*;

public class Test_1 {
    void  trackback(ArrayList<String> buf,StringBuilder ss,int idx,String num){
        if(idx == num.length()){
            buf.add(ss.toString());
        }
        char c = (char)(num.charAt(idx)-'0' + 'a');
            ss.append(c);
            trackback(buf,ss,idx+1,num);
        if(num.charAt(idx) == '1' || (num.charAt(idx) == '2' && (idx + 1 < num.length() && num.charAt(idx+1) < '6'))){
            int a1 =  num.charAt(idx)- '0';
            int a2 = num.charAt(idx+1) - '0';
            char c1 = (char)(a1*10+a2 + 'a');
            ss.append(c1);
            trackback(buf, ss, idx+2, num);
        }
    }
    public static void main(String[] args) {
        System.out.println(1 << -1);
        Stack<Character> st = new Stack<>();

    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st_1 = new Stack<>();
        for(int i = 0;i < st_1.size();++i){
            char c = s.charAt(i);
          if(c == '#'){
              st_1.pop();
              continue;
            }
            st_1.push(c);  
        }
        Stack<Character> st_2 = new Stack<>();
        for(int i = 0;i < st_2.size();++i){
            char c = s.charAt(i);
          if(c == '#'){
              st_2.pop();
              continue;
            }
            st_2.add(c);  
        }
        for(char c:st_1){
            System.out.print(c+" ");
        }
        for(char c:st_1){
            System.out.print(c+" ");
        }
        return st_1.equals(st_2);
    }
}
