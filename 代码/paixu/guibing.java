package paixu;

import java.util.Arrays;

public class guibing {
    public static void main(String[] args){
        guibing test =  new guibing();
        int[] nums = {9,8,7,6,5,23,0,4,3,2,1};
        System.out.println(Arrays.toString(test.sort(nums)));
    }

    public int[] merge(int[] arr1,int[] arr2){
        int m = arr1.length, n = arr2.length;
        int[] buf = new int[m+n];
        int left = 0, right = 0, idx = 0;
        while(left < m && right < n){
            if(arr1[left] < arr2[right])
                buf[idx++] = arr1[left++];
            else
                buf[idx++] = arr2[right++];
        }
        while(left < m){
            buf[idx++] = arr1[left++];
        }
        while(right < n){
            buf[idx++] = arr2[right++];
        }
        return buf;

    }
    public int[] sort(int[] nums){
        int[] buf = Arrays.copyOf(nums, nums.length);
        if(nums.length < 2)return nums;
        int mid = nums.length/2;
        int[] left = Arrays.copyOfRange(buf, 0, mid);
        int[] right = Arrays.copyOfRange(buf, mid, nums.length);
        return merge(sort(left), sort(right));
    }
}
