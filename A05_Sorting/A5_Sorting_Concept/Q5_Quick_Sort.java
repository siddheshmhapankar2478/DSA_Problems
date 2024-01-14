package A05_Sorting.A5_Sorting_Concept;

import java.util.Arrays;

public class Q5_Quick_Sort {
    public static void swap(int[] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr,int start,int end) {
        int pivot=arr[end],j=start-1;
        for(int i=start;i<=end;i++){
            if(arr[i]<pivot){
                j++;
                swap(arr,i,j);
            }
        }
        swap(arr,j+1,end);
        return j;
    }
    public static void quickSort(int[] arr,int start,int end) {
        if(start>=end)
            return;
        int partitionIndex=partition(arr,start,end);
        quickSort(arr, start, partitionIndex);
        quickSort(arr, partitionIndex+1,end);
    }
    public static void main(String[] args) {
        int[] arr={7,9,2,6,3,10,8,5,4,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}
