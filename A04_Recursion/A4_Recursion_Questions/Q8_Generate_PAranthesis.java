package A04_Recursion.A4_Recursion_Questions;

import java.util.ArrayList;
import java.util.List;

public class Q8_Generate_PAranthesis {
    static ArrayList<String> ans = new ArrayList<>();
    public static void recurr(int i, int n, StringBuilder sb, int open, int close) {
        if (open > n || close > n || close > open)
            return;
        if (sb.length() == 2 * n) {
            ans.add(sb.toString());
            return;
        }
        recurr(i + 1, n, sb.append("("), open + 1, close);
        sb.deleteCharAt(sb.length() - 1);
        recurr(i + 1, n, sb.append(")"), open, close + 1);
        sb.deleteCharAt(sb.length() - 1);
    }

    public static ArrayList<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder("");
        recurr(0, n, sb, 0, 0);
        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> ans = generateParenthesis(n);
        System.out.println(ans);
    }
}
