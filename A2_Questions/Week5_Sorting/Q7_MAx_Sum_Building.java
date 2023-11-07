package A2_Questions.Week5_Sorting;

import java.util.Arrays;

public class Q7_MAx_Sum_Building{
    public static void main(String[] args) {
        
    }
    public int maxSum(int[] nums) {
		Arrays.sort(nums);
		int sum=0;
		for(int i=0;i<nums.length;i=i+2){
			sum+=nums[i];
		}
		return sum;

	}
}