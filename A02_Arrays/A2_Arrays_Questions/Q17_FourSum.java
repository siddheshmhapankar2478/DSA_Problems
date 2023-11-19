package A02_Arrays.A2_Arrays_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q17_FourSum {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) 
                    continue;
                int newTarget = target - nums[i] - nums[j];
                // Check if the new target is negative
                if (newTarget < 0) 
                    break; // Break out of the loop if target is negative
                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum == newTarget) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        // Skip duplicates
                        while (left < right && nums[left] == nums[left + 1]) 
                            left++;
                        while (left < right && nums[right] == nums[right - 1]) 
                            right--;
                        left++;
                        right--;
                    } 
                    else if (sum < newTarget) 
                        left++;
                    else 
                        right--;
                    
                }
            }
        }
        return ans;
    }
}
