package A05_Sorting.A5_Sorting_Questions;

import java.util.Arrays;

public class Q3_Sam_Height {
    public static void main(String[] args) {
        int[] nums={4,1,3};
        int S=2;
        samHeight(nums, S);
    }
	public static int samHeight(int[] nums, int S) {
		// Your code goes here
		int[] sorted=new int[nums.length+1];
        for(int i=0;i<sorted.length-1;i++){
			sorted[i]=nums[i];
		}
		int index=0;
		sorted[sorted.length-1]=S;
		Arrays.sort(sorted);
        // System.out.println(Arrays.toString(sorted));
		for(int i=0;i<sorted.length;i++){
			if(sorted[i]==S){
				index=i;
				break;
			}
		}
		int rightElements=sorted.length-1-index;
		int leftElements=index-0;
		int ans=Math.abs(rightElements-leftElements);
		return ans;
	}
}
