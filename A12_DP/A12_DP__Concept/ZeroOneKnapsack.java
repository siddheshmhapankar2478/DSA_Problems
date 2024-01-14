package A12_DP.A12_DP__Concept;

import java.util.Arrays;

public class ZeroOneKnapsack {
    static int[][] dp;

    public static int recurr(int[] weight, int[] profit, int knapsack, int index) {
        if (index == weight.length || weight[index] > knapsack)
            return 0;
        if (dp[index][knapsack] != -1)
            return dp[index][knapsack];
        int left = recurr(weight, profit, knapsack, index + 1);
        knapsack -= weight[index];
        int right = profit[index] + recurr(weight, profit, knapsack, index + 1);
        knapsack += weight[index];
        return dp[index][knapsack] = Math.max(left, right);
    }

    public static int knapsack01problem(int[] weight, int[] profit, int knapsack) {
        dp = new int[1001][1001];
        Arrays.fill(dp, -1);
        return recurr(weight, profit, knapsack, 0);
    }

    public static void main(String[] args) {
        // int[] weight = { 1, 3, 4, 5 };
        // int[] profit = { 1, 4, 5, 7 };
        int[] weight = { 10, 20, 30 };
        int[] profit = { 60, 100, 120 };
        int knapsack = 50;
        int ans = knapsack01problem(weight, profit, knapsack);
        // System.out.println(Arrays.toString(dp));
        System.out.println(ans);
    }
}
