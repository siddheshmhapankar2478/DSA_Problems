package A05_Sorting.A5_Sorting_Concept;

import java.util.Arrays;

public class Q2_Selection_Sort {
    public static void main(String[] args) {
        int[] arr= {6,2,1,5,8,7,3,-1,1,-3};
        int[] ans=selection(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] selection(int[] arr) {
        for(int i=0;i<=arr.length-2;i++){
            int minIndex=minFind(i,arr.length-1,arr);
            swap(i,minIndex,arr);
        }
        return arr;
    }
    public static int minFind(int i,int j,int[]arr){
        int min=arr[i],minIndex=i;
        for(int ind=i;ind<=j;ind++){
            if(arr[ind]<min){
                min=arr[ind];
                minIndex=ind;
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
