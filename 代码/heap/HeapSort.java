package heap;

import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
     int[] arr = {4,6,1,9,3,6,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        //1.构建大顶堆
        for(int i = arr.length/2-1; i >= 0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr,i,arr.length);
        }

        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j = arr.length -1;j > 0;j--){
            //将堆顶元素与末尾元素进行交换
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;

            //重新对堆进行调整
            adjustHeap(arr,0,j);//j = arr.length -1
        }
         
    }
    public static void adjustHeap(int[] arr,int i,int length){
        int temp = arr[i];
        //从i结点的左子结点开始，也就是2i+1处开始
        for(int k = i*2 + 1;k < length;k = k*2 + 1){
            k = (k+1 < length && arr[k] < arr[k+1])? k+1:k;
            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
            
        }
        arr[i] = temp;
        
    }
}
