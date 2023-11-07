package A2_Questions.Week4_Recursion;
import java.util.Arrays;

public class Q7_Min_Cost_Stairs {
    public static void main(String[] args) {
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost=new int[cost.length];
        Arrays.fill(minCost,-1);
        int first=recursion(0,cost,minCost);
        int second=recursion(1,cost,minCost);
        return Math.min(first,second);
	}
	public int recursion(int index,int[] cost,int[] minCost) {
        if(index>=cost.length)
            return 0;
        if(minCost[index]!=-1)
            return minCost[index];
        int op1=recursion(index+1,cost,minCost);
        int op2=recursion(index+2,cost,minCost);
        minCost[index]= Math.min(op1,op2)+cost[index];
        return minCost[index];

    }
}
