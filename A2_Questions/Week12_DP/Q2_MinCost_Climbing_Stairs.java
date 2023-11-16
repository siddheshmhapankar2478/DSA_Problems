package A2_Questions.Week12_DP;

import java.util.Arrays;

public class Q2_MinCost_Climbing_Stairs {
    public static void main(String[] args) {
        
    }
    //Method1
    int[] dp;
    public int recurr(int[] cost,int index) {
        if(index>=cost.length)
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        int op1=cost[index]+recurr(cost,index+1);
        int op2=cost[index]+recurr(cost,index+2);
        return dp[index]=Math.min(op1,op2);
    }
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
        int ans1=recurr(cost,0);
        int ans2=recurr(cost,1);
        return Math.min(ans1,ans2);
    }
    //Method2
    public int minCostClimbingStairs2(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+2];
        for(int i=n-1;i>=0;i--){
            dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2]);
        }
        return Math.min(dp[0],dp[1]);
    }
}
