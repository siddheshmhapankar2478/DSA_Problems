package A04_Backtracking.A4_BackTracking_Questions;

public class Q4_Xor_Total {
    public static void main(String[] args) {
        int[] nums={1,3};
        int ans=subsetXORSum(nums);
        System.out.println(ans);
    }
    public static void recursion(int[] nums,int index,int ans,int[] sum){
        if(index==nums.length){
            sum[0]=sum[0]+ans;
            return;
        }
        recursion(nums, index+1, ans,sum);
        ans=ans^nums[index];
        recursion(nums, index+1, ans,sum);
        ans=ans^nums[index];
    }
    public static int subsetXORSum(int[] nums) {
		// Your code goes here
        int[] sum = new int[1]; 
        int index=0,ans=0;
        recursion(nums,index,ans,sum);
        return sum[0];
	}
}
