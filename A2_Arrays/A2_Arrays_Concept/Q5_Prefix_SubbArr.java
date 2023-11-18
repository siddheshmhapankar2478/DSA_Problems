package A2_Arrays.A2_Arrays_Concept;
public class Q5_Prefix_SubbArr {
    public static int[] computePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }

    public static int getSubarraySum(int[] prefixSum, int start, int end) {
        if (start == 0) {
            return prefixSum[end];
        } else {
            return prefixSum[end] - prefixSum[start - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = computePrefixSum(arr);

        int subarraySum = getSubarraySum(prefixSum, 1, 3);
        System.out.println("Sum of subarray: " + subarraySum);
    }
    
}





