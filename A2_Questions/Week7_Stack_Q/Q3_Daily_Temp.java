package A2_Questions.Week7_Stack_Q;

import java.util.Arrays;
import java.util.Stack;

public class Q3_Daily_Temp {
    public static void main(String[] args) {
        int[] nums={73,74,75,71,69,72,76,73};
        int[] ans=dailyTemperatures(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int current=temperatures[i];
            while(!stack.isEmpty()&&current>temperatures[stack.peek()])
                ans[stack.pop()]=i;
            stack.push(i);
        }
        while(!stack.isEmpty())
            ans[stack.pop()]=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]!=0)
                ans[i]=ans[i]-i;
    
        }
        return ans;
	}

}
