package A2_Questions.Week2_Arrays;
import java.util.*;
public class Q15_MAxDiff_two_Pair {
    public static void main(String[] args) {
        
    }
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]*nums[nums.length-2])-(nums[0]*nums[1]);
    }
}
