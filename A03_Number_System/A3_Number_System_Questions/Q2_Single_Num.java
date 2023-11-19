package A03_Number_System.A3_Number_System_Questions;

public class Q2_Single_Num {
    public static void main(String[] args) {
        
    }
    public int singleNumber(int[] nums) {
		// Your code goes here
		int ans=0;
		for(int i=0;i<nums.length;i++){
			ans=ans^nums[i];
		}
		return ans;
	}
}
