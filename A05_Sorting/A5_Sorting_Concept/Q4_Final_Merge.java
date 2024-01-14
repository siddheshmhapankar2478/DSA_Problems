package A05_Sorting.A5_Sorting_Concept;

import java.util.Arrays;

public class Q4_Final_Merge {
    public static int[] sortArray(int[] arr, int l, int r) {
        mergeSort(arr, l, r);
        return arr;
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) 
            return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) 
            leftArray[i] = arr[l + i];
        for (int i = 0; i < n2; i++) 
            rightArray[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) 
                arr[k++] = leftArray[i++];
            else
                arr[k++] = rightArray[j++];
        }

        while (i < n1) 
            arr[k++] = leftArray[i++];
        while (j < n2) 
            arr[k++] = rightArray[j++];
        
    }
    public static void main(String[] args) {
        int[] arr={7,9,2,6,3,10,8,5,4,1};
        int start=0,end=arr.length-1;
        mergeSort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
}
