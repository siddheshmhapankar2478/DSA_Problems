package A04_Recursion.A4_Recursion_Questions;

import java.util.Stack;

public class Q9_Reverse_Stack_Recursion {
    public static void main(String[] args) {

    }

    public static void insertBottom(int ele, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            stack.push(ele);
        } else {
            int top = stack.pop();
            insertBottom(ele, stack);
            stack.push(top);
        }
    }

    public static void reverseStack(Stack<Integer> stack) {
        int ele = 0;
        if (stack.isEmpty())
            return;
        if (!stack.isEmpty()) {
            ele = stack.pop();
            reverseStack(stack);
            insertBottom(ele, stack);
        }
    }
}
