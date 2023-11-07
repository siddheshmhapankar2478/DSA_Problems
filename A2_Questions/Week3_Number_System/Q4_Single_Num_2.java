package A2_Questions.Week3_Number_System;

public class Q4_Single_Num_2 {
    public static void main(String[] args) {
        
    }
    public int singleNumber(int[] nums) {
        int[] ans=new int[32];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<32;j++){
                if((nums[i]&(1<<j))!=0)
                    ans[j]++;
            }
        }
        int result = 0;
        for (int j = 0; j < 32; j++) {
            if (ans[j] % 3 != 0) {
                result |= (1 << j);
            }
        }
        
        return result;

    }
}
