package A05_Sorting.A5_Sorting_Concept;

import java.util.Arrays;

public class Q1_Bubble_Example {
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }    
    public static void insertionSort(int[] arr, int size) {
        for(int i=1;i<size;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={8,6,2,5,1};
        insertionSort(arr, arr.length); 
        System.out.println(Arrays.toString(arr));       
    }
}
