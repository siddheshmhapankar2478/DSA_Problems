package A05_Sorting.A5_Sorting_Concept;

import java.util.Arrays;

public class Q1_BubbleSort {
    public static void main(String[] args) {
        int[] arr= {6,2,1,5,8,7,3,-1,1,-3};
        int[] ans=bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] bubbleSort(int[] arr) {
        int swapCount=0,n=arr.length;
        for(int pass=1;pass<=n-1;pass++){
            for(int i=0;i<n-pass;i++){
                if(arr[i]>arr[i+1]){
                    swap(i,i+1,arr);
                    swapCount++;
                }
            }
            if(swapCount==0)
                break;
        }
        return arr;
    }
    public static void swap(int i,int j,int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
