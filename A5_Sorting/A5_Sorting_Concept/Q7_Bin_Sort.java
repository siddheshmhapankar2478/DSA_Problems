package A5_Sorting.A5_Sorting_Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q7_Bin_Sort {
    public static void binSort(double[] arr, int numBins) {
        // Create the bins
        List<List<Double>> bins = new ArrayList<>();
        for (int i = 0; i < numBins; i++) {
            bins.add(new ArrayList<>());
        }
        // Distribute elements into the bins
        for (double value : arr) {
            int binIndex = (int) (numBins * value);
            bins.get(binIndex).add(value);
        }
        // Sort the elements within each bin
        for (List<Double> bin : bins) {
            Collections.sort(bin);
        }
        // Combine the elements from all the bins
        int index = 0;
        for (List<Double> bin : bins) {
            for (double value : bin) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {0.75, 0.12, 0.42, 0.25, 0.81};
        int numBins = 5;
        binSort(arr, numBins);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
