package A2_Questions.Week2_Arrays;
import java.util.*;

public class Q16_Three_Sum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> ans=threeSum(nums);
        System.out.println(ans);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates of the first element
            }
            int target = -nums[i];
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                if (nums[start] + nums[end] == target) {
                    ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end && nums[start] == nums[start + 1]) {
                        start++; // Skip duplicates of the second element
                    }
                    while (start < end && nums[end] == nums[end - 1]) {
                        end--; // Skip duplicates of the third element
                    }
                    start++;
                    end--;
                } else if (nums[start] + nums[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return ans;
    }
}
