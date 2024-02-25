package A02_Arrays.A2_Arrays_Questions;

import java.util.Arrays;

public class Q18_Rearrange_By_Sign {
    public static void main(String[] args) {
        Q18_Rearrange_By_Sign q=new Q18_Rearrange_By_Sign();
        int[] nums={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(q.rearrangeArray(nums)));
    }
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n];
        int[] neg=new int[n];
        int p=0;n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[p++]=nums[i];
            }
            else{
                neg[n++]=nums[i];
            }
        }
        p=0;
        n=0;
        for(int i=0;i<nums.length;i++){
                nums[i]=(i%2==0)?pos[p++]:neg[n++];
        }
        return nums;
    }
    public int[] rearrangeArray2(int[] nums) {
        int n=nums.length,pos=0,neg=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos=pos+2;
            }
            else{
                ans[neg]=nums[i];
                neg=neg+2;
            }
        }
        return ans;
    }
}
