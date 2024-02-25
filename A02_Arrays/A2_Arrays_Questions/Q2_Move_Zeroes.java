package A02_Arrays.A2_Arrays_Questions;

import java.util.Arrays;

public class Q2_Move_Zeroes {
    public static void main(String[] args) {
        Q2_Move_Zeroes q=new Q2_Move_Zeroes();
        int[] nums={0,7,0,1,3,2,0,4,5};
        q.moveZeroes(nums);
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
