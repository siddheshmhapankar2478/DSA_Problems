package A4_Backtracking.A4_BackTracking_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_Subsets_2 {
    static List<List<Integer>> ans = new ArrayList<>();

    public static void recurr(int index, int[] nums, List<Integer> curr) {
        if (index > nums.length) {
            return;
        }
        ans.add(new ArrayList<>(curr));
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1])
                continue;
            curr.add(nums[i]);
            recurr(i + 1, nums, curr);
            curr.remove(curr.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> curr = new ArrayList<>();
        recurr(0, nums, curr);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2};
        List<List<Integer>> ans=subsetsWithDup(nums);
        System.out.println("All possible subsets with duplicates:"+ans);
    }
}
