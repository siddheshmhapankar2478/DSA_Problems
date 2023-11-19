package A07_Stack_Queue.A7_Stack_Queue_Questions;

import java.util.Arrays;
import java.util.Stack;

public class Q1_Next_Smaller {
    public static void main(String[] args) {
        int[] nums={5,4,6,1,2};
        // int[] ans=nextSmallerElement(nums);
        int[] ans=previousGreaterElement(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] nextGreaterElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans=new int[nums.length];
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
    
    public static int[] nextSmallerElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            while(!stack.isEmpty()&&current<nums[stack.peek()])
                ans[stack.pop()]=current;
            stack.push(i);
        }
        while(!stack.isEmpty())
            ans[stack.pop()]=-1;
    
        return ans;
	}
    public static int[] previousGreaterElement(int[] arr) {
      Stack<Integer> stack = new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int current=arr[i];
            while(!stack.isEmpty()&&current>arr[stack.peek()])
                ans[stack.pop()]=current;
            stack.push(i);
        }
        while(!stack.isEmpty())
            ans[stack.pop()]=-1;
    
        return ans;
	}
    public int[] previousSmallerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
          int[] ans=new int[arr.length];
          for(int i=arr.length-1;i>=0;i--){
              int current=arr[i];
              while(!stack.isEmpty()&&current<arr[stack.peek()])
                  ans[stack.pop()]=current;
              stack.push(i);
          }
          while(!stack.isEmpty())
              ans[stack.pop()]=-1;
      
          return ans;
      }
}
