package A04_Recursion.A4_Recursion_Questions;

import java.util.Arrays;

public class Q5_Nth_Tribonacci {
    public static void main(String[] args) {
        
    }
    public int tribonacci(int n) {
		// Your code goes here
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return rec(n,dp);
	}
    public static int rec(int n, int[] dp){
        if(n<=0)
            return 0;
        if(n==1||n==2){
            dp[n]=1;
            return 1;
        }
        if(dp[n]!=-1)
            return dp[n];
        int one=rec(n-1,dp);
        int two=rec(n-2,dp);
        int three=rec(n-3,dp);
        dp[n]=one+two+three;
        return dp[n];
    }
}
