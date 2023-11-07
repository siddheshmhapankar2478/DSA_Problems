package A2_Questions.Week2_Arrays;

public class Q3_Missing_Num {
    public static void main(String[] args) {
        
    }   
    public int missingNumber(int[] nums) {
		// Your code goes here

        int sumN=nums.length*(nums.length+1)/2;
        int sum=0;
        for(int x: nums){
            sum=sum+x;
        }
        return sumN-sum;
	}
}



