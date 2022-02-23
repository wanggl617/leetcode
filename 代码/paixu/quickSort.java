package paixu;

import java.util.Arrays;

import javax.management.Query;

public class quickSort {
    
    public static void main(String[] args) {
        int[] arr = {10,22,45,0,5,2,67,345,231,52};
        int N = arr.length;
        quickst(arr, 0, N-1);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void quickst(int[] arr, int low, int high){
        if (low < high){
            int idx = getIndex(arr, low, high);
            quickst(arr, idx+1, high);
            quickst(arr, low, idx-1);
        }

    }
    public static int getIndex(int[] arr,int low,int high){
        int temp = arr[low];
        while(low < high){
            while(low < high && arr[high] >= temp){
                high--;
            }
            arr[low] = arr[high];
            while(low < high && arr[low] <= temp){
                low++;
            }
            arr[high] = arr[low];
            arr[low] = temp;
        }
        
        return low;
    }
}
