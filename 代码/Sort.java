import java.util.*;
public class Sort {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    //Integer[] new_nums =   Arrays.stream(nums).boxed().toArray(Integer[]::new);
    //  Arrays.sort(new_nums,(o1,o2)->o2 - o1 );
    //  System.out.println(Arrays.asList(new_nums));
     
    //  Set<Integer> buf  = new HashSet<>(Arrays.asList(new_nums));
    //  for(Integer x: buf){
    //      System.out.println(x);
    //  }
    String[] input=new String[] {"tmc","apad","apac","apache","nihao","nihaoa"};
        List<String> buf = new ArrayList<>();
        buf.add("tmc");
        buf.add("apad");
        buf.add("apache");
        buf.add("nihao");
        buf.add("nihaoa");
        Collections.sort(buf, new Comparator<>(){
            //@Override
            public int compare(String o1, String o2) {
                if(o2.length() == o1.length())
                    return o1.compareTo(o2);
                return o2.length() - o1.length();
            }

        });
    int[][] properties = {{5,4},{5,5},{2,3},{4,6}};
    Arrays.sort(properties, new Comparator<>(){
        public int compare(int[] o1,int[]o2){
            if(o1[0]!=o2[0])return o1[0]-o2[0];
            else return o1[1]-o2[1];
        }
    });
    for(int[] x: properties){
         for(int num:x){
             System.out.print(num+" ");
         }
         System.out.println();
    }
    
    }
}
