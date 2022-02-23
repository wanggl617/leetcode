package heap;
import java.util.*;
public class Heap {
    public static void main(String[] args) {
        int[] arr = {4,6,1,9,3,6,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        PriorityQueue<Integer> pq  = new PriorityQueue<Integer>((a,b)->(b-a));
        for(Integer num : arr){
            pq.offer(num);
        }
        for(int i = 0 ; i < arr.length; ++i){
            System.out.println(pq.peek());
            arr[i] = pq.poll();
            
        }
    }
}
