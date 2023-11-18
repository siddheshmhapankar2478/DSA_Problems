package A3_Number_System.A3_Number_System_Concept;

public class Q3_Single_Num {
    public static void main(String[] args) {
        int [] nums={2,2,3,2};
        int ans=singleNumber(nums);
        System.out.println("ans="+ans);
    }
    public static int singleNumber(int[] nums) {
		// Your code goes here
		int ans=0;
		for(int i=0;i<nums.length;i++){
			ans=ans^nums[i];
            System.out.println(ans);
		}
		return ans;
	}
}
