import java.util.*;

public class Hello {
    public static void main(String[] args) { 
        List<Integer[]> list = new ArrayList<>();
        Integer[] nums1 = {1,1,1,3,3,4,3,2,4,2};
        Integer[] nums2 = {1,2,3,4};
        int a = 10;
        Integer b = a;
         int x = b.parseInt("12");
        System.out.println(x);
        list.add(nums1);
        list.add(nums2);
        for (Integer[] i :list) {
            boolean ans = containsDuplicate(i);
            System.out.println(ans);
        }
        String s1 = "dabnsdnsa";
        for (char c : s1.toCharArray()) {
            System.out.println(c);
        }
        
     }
    public static boolean containsDuplicate(Integer[] nums){

        Set<Integer> hashset = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashset.add(nums[i]);
        }
        return hashset.size()!=nums.length;
    }
}
