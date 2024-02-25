package A02_Arrays.A2_Arrays_Questions;

import java.util.HashMap;
import java.util.Arrays;

public class Q5_Two_Sum {
    public static void main(String[] args) {
        int[] nums={1,2,3,7,9,15};
        int target=9;
        Q5_Two_Sum q=new Q5_Two_Sum();
        System.out.println(Arrays.toString(q.twoSum(nums, target)));
    }
    int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=hm.get(target-nums[i]);
                return ans;
            }
            hm.put(nums[i],i);
        }                    
        return ans;
    }
}
