package A2_Questions.Week2_Arrays;

import java.util.HashMap;
public class Q5_Two_Sum {
    public static void main(String[] args) {
        
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
