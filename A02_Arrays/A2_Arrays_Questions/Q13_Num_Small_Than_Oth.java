package A02_Arrays.A2_Arrays_Questions;

import java.util.Arrays;

public class Q13_Num_Small_Than_Oth {
    public static void main(String[] args) {
        int[] arr={8,1,2,2,3};
        int[]ans=smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket=new int[101];
        for(int i=0;i<nums.length;i++){
            bucket[nums[i]]++;
        }
        for(int i=1;i<bucket.length;i++){
            bucket[i]=bucket[i]+bucket[i-1];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=bucket[nums[i]-1];
        }
        return ans;
    }
    public int[] smallerNumbersThanCurrentS(int[] nums) {
        int[] bucket=new int[101];
        int n=nums.length;
        for(int i=0;i<n;i++){
            bucket[nums[i]]++;
        }

        for(int i=1;i<101;i++){
            bucket[i]=bucket[i-1]+bucket[i];
        }

        for(int i=0;i<n;i++){
            if(nums[i]-1>=0)
                nums[i]=bucket[nums[i]-1];
        }
        return nums;
        
    }
}
