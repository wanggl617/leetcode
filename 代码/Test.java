import java.util.*;
public class Test {

    public long[] getDistances(int[] arr) {
        long[] ans = new long[arr.length];
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a,int[] b){
                return a[1] - b[1];
            }
        });
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < n; ++i){
            if(!map.containsKey(arr[i]))map.put(arr[i],new ArrayList<>());
            ArrayList<Integer> temp = map.get(arr[i]);
            temp.add(i);
            map.put(arr[i], new ArrayList<>(temp));
        }
        for(Integer index : map.keySet()){
            System.out.println(map.get(index).toString());
            ArrayList<Integer> list = map.get(index);
            long[] pre = new long[list.size()];
            long[] end = new long[list.size()];
            pre[0] = 0;
            end[list.size()-1] = 0;
            for(int i = 1 ; i < map.get(index).size();++i){
                pre[i] = pre[i-1] + i*Math.abs(list.get(i)-list.get(i-1));
                end[list.size()-1-i] = end[list.size()-i] + i*Math.abs(list.get(list.size()-i)-list.get(list.size()-i-1));
            }
            for(int i = 0 ; i < list.size(); ++i){
                ans[i] = pre[i] + end[i];
            }
            
        }

            
          return ans;  
    }


























    public static void main(String[] args) {
        // List<Integer> path = new ArrayList<>();
        // // List<List<Integer>> ans = new ArrayList<>();
        Integer[] arr = {1,22,2,34,56};
        // Arrays.sort(arr);
        // List<Integer> ans = Arrays.asList(arr) ;
        System.out.println(Arrays.toString(arr));
        
            List<Double> buf = new ArrayList<>();

        // List<Double> list = new ArrayList<Double>();
        // Double arr3[] = list.toArray(new Double[0]);
        // // System.out.println(arr.length);
        // // path = Arrays.asList(arr);
        // int a = Math.abs(-1);
        // ans.add(Arrays.asList(arr)); 
        // for(List<Integer> x:ans){
        //     System.out.println(x);
        // String s = "abdccce";
        // char c = 'X';
        // c = (char) (c + 32);
        // s = s.substring(0, s.length()-1);
        // System.out.println(c);
        // List<String> ans = new ArrayList<>();
        // ans.add(s);
        // s = s+'a';

        // String[] str = {"sda","weq","eqe"};
        
        // String version1 = "1.01";
        // String[] v1 = version1.split("\\.");
        // int num = Integer.parseInt(v1[1]);
        // // System.out.println(num);
        // int x = 0;
        // x = (x << 1)+1;
        //System.out.println(x);
        // System.out.println(0x7fffffff);
        // System.out.println((1 << 31) - 1);
        // int[] nums = {1,3,5,7,2,4,6,8};
        // Set<Integer> buf = new HashSet<>();
        // for(int i = 0;i < nums.length;++i){
        //     buf.add(nums[i]);
        // }
        // System.out.println(gcd(3,8));

        // List<Integer> path = new ArrayList<>();
        // path.add(nums[1]);
        // System.out.println(path.get(0));

        // String s = "adbaskdas";
        // char[] cs = s.toCharArray();
        // Stack<Character> st = new Stack<>();
        // Stack<Integer> a = new Stack<>();
        // a.push(1);
        // for(int i = 0; i < s.length();++i){
        //     char  c = cs[i];
        //     char c1  = s.charAt(i);
        //     if(st.empty()){
        //         st.peek();
        //         st.push(c);
        //     }
        // }
        List<Integer> path = new ArrayList<>();
            path.add(1);
            path.add(2);
            path.add(3);
            path.add(4);
            path.add(5);
            System.out.println(path.toString());
        // List<Integer> temp = path;
        // temp = path;
        // //int[][] a = {{1,2,3,0,0,3},{1,6,3,9,2,22}};
        // for(Integer num:temp){
        //     System.out.println(num);
        // }
        // char[] a = {1,2,3,0,0,3};
        // char[] b = {1,2,3,0,0,3} ;
        // System.out.println(Arrays.equals(a, b));
        // List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // ArrayList<String> list = new ArrayList<String>(Arrays.asList("o1", "o2"));

        // ans.add(new ArrayList<Integer>(Arrays.asList(nums[1],nums[2],nums[3])));
        // for(List<Integer> l:ans){
        //     System.out.println(Arrays.asList(l));
        // }
        //Set<Character> buf = new HashSet<>();
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        // Map<Character,char[]> map = new HashMap<>();
        // map.put('2',new char[]{'a','b','c'});
        // map.put('3',new char[]{'d','e','f'});
        // map.put('4',new char[]{'g','h','i'});
        // map.put('5',new char[]{'j','k','l'});
        // map.put('6',new char[]{'m','n','o'});
        // map.put('7',new char[]{'p','q','r','s'});
        // map.put('8',new char[]{'t','u','v'});
        // map.put('9',new char[]{'w','x','y','z'});
        // // for(char buf : map.keySet()){
        // //     char[] temp = map.get(buf);
        // //     System.out.println(Arrays.toString(temp));
        // // }
        // String str ="";
        // char c = '2';
        // str = str + c;
        // System.out.println(-5%3);
        // Double[] buf1 = new Double[2];
        // buf1[0] = (double)(1/3);
        // buf1[1] = (double)(2/5);
        //     System.out.println(buf1[0]);
        //     System.out.println(buf1[1]);
      
        
    }
    
    public static int gcd(int a,int b){
        
        if(b!=0) {
            System.out.println("%:"+a%b);
            return gcd(b,a%b);
        }

        return a;
    }

}
