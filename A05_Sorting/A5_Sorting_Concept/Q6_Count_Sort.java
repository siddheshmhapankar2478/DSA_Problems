package A05_Sorting.A5_Sorting_Concept;

import java.util.Arrays;

public class Q6_Count_Sort {
    public static void countSort(int[] arr) {
        int n = arr.length;
        int max = Arrays.stream(arr).max().orElse(0);
        int min = Arrays.stream(arr).min().orElse(0);

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[n];

        // Count the occurrences of each element
        for (int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }

        // Modify the count array to store cumulative counts
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in the correct position
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the sorted elements back to the input array
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 4, 2, 3, 1, 2};
        countSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}