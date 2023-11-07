package A2_Questions.Week2_Arrays;

import java.util.List;

public class Q1_Remove_Dupli {
    public static void main(String[] args) {
        
    }
    public int removeDuplicates(int[] nums) {
        int i=0;
        if(nums.length==1||nums.length == 0)
            return nums.length;
        
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    
    public List<Integer> removeDuplicates(List<Integer> nums) {
		// Your code goes here
         for (int i = nums.size() - 2; i >= 0; i--) {
            if (nums.get(i).equals(nums.get(i + 1))) {
                nums.remove(i + 1);
            }
        }
        return nums;
	}

}
