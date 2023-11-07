package A2_Questions.Week5_2DAarray;

public class Q4_Richest_Customer {
    public static void main(String[] args) {
        
    }
    public static int maximumWealth(int[][] accounts) {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int currentSum=0;
            for(int j=0;j<accounts[0].length;j++){
                currentSum=currentSum+accounts[i][j];
            }
            if(currentSum>maxSum)
                maxSum=currentSum;
        }
        return maxSum;
    }
}


