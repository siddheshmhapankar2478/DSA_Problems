package A05_Sorting.A5_Sorting_Concept;

import java.util.Arrays;

public class Q2_Selection_Sort {
    public static void main(String[] args) {
        int[] arr= {6,2,1,5,8,7,3,-1,1,-3};
        int[] ans=selection(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] selection(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=minFind(i,n-1,arr);
            swap(i,minIndex,arr);
        }
        return arr;
    }
    public static int minFind(int start,int end,int[]arr){
        int min=Integer.MAX_VALUE,minIndex=-1;
        for(int i=start;i<=end;i++){
            if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    public static void swap(int i,int j,int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
