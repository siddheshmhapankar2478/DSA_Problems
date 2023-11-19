package A05_Sorting.A5_Sorting_Questions;

import java.util.Arrays;

public class Q5_Inversions {
    public static long inversionCount(int[] arr) {
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

    public static long mergeAndCount(int[] arr, int start, int mid, int end) {
        int[] leftArray = Arrays.copyOfRange(arr, start, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, end + 1);
        int i = 0, j = 0, k = start;
        long inversionCount = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
                inversionCount += (mid - start + 1) - i;
            }
        }

        while (i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }

        return inversionCount;
    }

    public static long mergeSortAndCount(int[] arr, int start, int end) {
        if (start >= end) {
            return 0;
        }

        int mid = (start + end) / 2;
        long leftCount = mergeSortAndCount(arr, start, mid);
        long rightCount = mergeSortAndCount(arr, mid + 1, end);
        long mergeCount = mergeAndCount(arr, start, mid, end);

        return leftCount + rightCount + mergeCount;
    }
    public static void main(String[] args) {
        int[] arr={2, 4, 1, 3, 5};
        long ans=inversionCount(arr);
        System.out.println(ans);
    }
}
