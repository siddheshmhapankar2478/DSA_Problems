package A02_Arrays.A2_Arrays_Questions;

import java.util.Arrays;

public class Q2_Move_Zeroes {
    public static void main(String[] args) {
        
    }
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                nums[index++]=nums[i];
        }
        while(index!=nums.length)
            nums[index++]=0;
        System.out.println(Arrays.toString(nums));
    }
}
