package A05_Sorting.A5_Sorting_Questions;


public class Q4_Sum_Of_Sorted_Arrays {
    public static void main(String[] args) {

    }
    public int[] sortedSquares(int[] nums) {
		// Your code goes here
		int start=0,end=nums.length-1;
		int[] ans=new int[nums.length];
		int i=ans.length-1;
		while(start<=end){
			int startSqr=nums[start]*nums[start];
			int endSqr=nums[end]*nums[end];
			if(startSqr>endSqr){
				ans[i--]=startSqr;
				start++;
			}
			else{
				ans[i--]=endSqr;
				end--;
			}
		}
		return ans;
	}
}
