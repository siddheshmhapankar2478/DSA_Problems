package A2_Questions.Week7_Stack_Q;

import java.util.Arrays;
import java.util.Stack;

public class Q2_Next_Greater_Ele2 {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        nextGreaterElements(nums);
    }
    public static int[] nextGreaterElements(int[] nums) {
		// Your code goes here
		int[] newArr=new int[nums.length*2];
		for(int i=0;i<newArr.length;i++){
			if(i<nums.length)
				newArr[i]=nums[i];
			else
				newArr[i]=nums[i-nums.length];
		}
        System.out.println(Arrays.toString(newArr));
			int[] ans=nextGreaterElement(newArr,nums.length);
			
			return ans;
	}
	public static int[] nextGreaterElement(int[] nums,int n) {
        Stack<Integer> stack = new Stack<>();
        int[] ans=new int[n];
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            while(!stack.isEmpty()&&current>nums[stack.peek()])
                ans[stack.pop()]=current;
            stack.push(i);
        }
        while(!stack.isEmpty())
            ans[stack.pop()]=-1;
    
        return ans;
	}

}
