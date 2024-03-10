package A05_Sorting.A5_Sorting_Concept;

import java.util.Arrays;

public class Q3_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr= {6,2,1,5,8,7,3,-1,1,-3};
        int[] ans=insertionSort(arr);
        System.out.println(Arrays.toString(ans));        
    }
    public static int[] insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i;
            while(j>0&&arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        return arr;
    }
}
