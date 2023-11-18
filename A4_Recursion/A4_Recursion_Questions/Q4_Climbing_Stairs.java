package A0_Questions.A4_Recursion_Questions;

import java.util.Arrays;

public class Q4_Climbing_Stairs {
    public static void main(String[] args) {

    }

    // Method1
    int[] dp;

    public int recurr(int i, int n) {
        if (i > n)
            return 0;
        if (i == n)
            return 1;
        if (dp[i] != -1)
            return dp[i];
        int op1 = recurr(i + 1, n);
        int op2 = recurr(i + 2, n);
        return dp[i] = op1 + op2;
    }

    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return recurr(0, n);
    }

    // Method2
    public int climbStairs2(int n) {
        if (n == 0 || n == 1)
            return n;
        int[] dp = new int[n + 2];
        dp[dp.length - 1] = 0;
        dp[dp.length - 2] = 1;
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = dp[i + 1] + dp[i + 2];
        }
        return dp[0];
    }

    // Method3
    public int climbStairs3(int n) {
        if (n == 0 || n == 1)
            return n;
        int prev2 = 0;
        int prev = 1;
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans = prev + prev2;
            prev2 = prev;
            prev = ans;
        }
        return ans;
    }

}
