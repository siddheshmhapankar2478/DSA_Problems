package A1_Concept.Week5_Sorting;

import java.util.Arrays;

public class Q3_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr= {6,2,1,5,8,7,3,-1,1,-3};
        int[] ans=insertionSort(arr);
        System.out.println(Arrays.toString(ans));        
    }
    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0&&temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
