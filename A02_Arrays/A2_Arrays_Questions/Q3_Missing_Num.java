package A02_Arrays.A2_Arrays_Questions;

public class Q3_Missing_Num {
    public static void main(String[] args) {
        
    }   
    public int missingNumber(int[] nums) {
        int sumN=nums.length*(nums.length+1)/2;
        int sum=0;
        for(int x: nums){
            sum=sum+x;
        }
        return sumN-sum;
	}
    //Method 2 using Xor
    public int missingNumber2(int[] nums) {
        int n=nums.length;
        int ans=n;
        for(int i=0;i<n;i++){
            ans=ans^nums[i]^i;
        }
        return ans;
    }
}



