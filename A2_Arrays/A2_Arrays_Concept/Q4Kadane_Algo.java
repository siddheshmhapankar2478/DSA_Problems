package A2_Arrays.A2_Arrays_Concept;
public class Q4Kadane_Algo {
    public static int maxSubarraySum(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE; 
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum > maxi) 
                maxi = currSum;
            if (currSum < 0)       // If currSum < 0: discard the currSum calculated
                currSum = 0;
        }
        return maxi;
    }

    public static void main(String args[]) {
        int[] arr = { -2, -1, -3, -4, -1, -2, -1, -5, -4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }

}






