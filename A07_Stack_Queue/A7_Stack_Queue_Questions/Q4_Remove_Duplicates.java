package A07_Stack_Queue.A7_Stack_Queue_Questions;

import java.util.Stack;

class IntPair {
    char data;
    int count;

    public IntPair(char data, int count) {
        this.data = data;
        this.count = count;
    }
}
public class Q4_Remove_Duplicates {
    public static void main(String[] args) {
        String ans=removeDuplicates("deeedbbcccbdaa", 3);
        System.out.println(ans);
    }
    public static String removeDuplicates(String s, int k) {
        Stack<IntPair> stack=new Stack<>();
		StringBuilder ans=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty()&&ch==stack.peek().data)
                stack.peek().count+=1;
            else
                stack.push(new IntPair(ch, 1));
            if(!stack.isEmpty()&&k==stack.peek().count)
                stack.pop();
        }
        while (!stack.isEmpty()) {
            char ch = stack.peek().data;
            int count = stack.pop().count;
            while (count-- > 0) {
                ans.append(ch);
            }
        }
        return ans.toString();
	}  

}
