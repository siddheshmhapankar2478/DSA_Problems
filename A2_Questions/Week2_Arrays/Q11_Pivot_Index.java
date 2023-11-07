package A2_Questions.Week2_Arrays;

public class Q11_Pivot_Index {
    public static void main(String[] args) {
        
    }
    public int pivotIndex(int[] nums) {
		int sum=0,leftsum=0,rightsum=0;
        for(int i=0;i<nums.length;i++)
            sum=sum+nums[i];
        for(int i=0;i<nums.length;i++){
			if(i==0)
				leftsum=0;
			else
				leftsum=leftsum+nums[i-1];
			rightsum=sum-leftsum-nums[i];
			if(leftsum==rightsum)
				return i;
        }
        return -1;
	}
}
