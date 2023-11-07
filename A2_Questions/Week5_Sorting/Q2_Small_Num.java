package A2_Questions.Week5_Sorting;

public class Q2_Small_Num {
    public static void main(String[] args) {
        
    }
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket=new int[101];
        for(int i=0;i<nums.length;i++){
            bucket[nums[i]]++;
        }
        for(int i=1;i<bucket.length;i++){
            bucket[i]=bucket[i]+bucket[i-1];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                ans[i]=0;
            else
                ans[i]=bucket[nums[i]-1];
        }
        return ans;
    }
}
