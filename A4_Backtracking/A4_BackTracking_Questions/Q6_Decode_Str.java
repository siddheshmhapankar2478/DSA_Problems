package A4_Backtracking.A4_BackTracking_Questions;

import java.util.Stack;

public class Q6_Decode_Str {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        decodeString(s);
    }

    public static void recursion(Stack stack) {

    }

    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            System.out.println("i " + " " + i + " " + sb + " " + stack);
            if (s.charAt(i) != ']')
                stack.push(s.charAt(i));
            if (s.charAt(i) == ']') {
                while (stack.peek() != '[') {
                    sb.insert(0, stack.pop());
                }
                stack.pop();
                int number = 0;
                while (Character.isDigit(s.charAt(i))) {
                    number = number * 10 + (int) s.charAt(i);
                }
            }
        }
        recursion(stack);
        return s;
    }

}
