package A02_Arrays.A2_Arrays_Questions;

public class Q7_Best_Time_To_Buy {
    public static void main(String[] args) {
        
    }
    public int maxProfit(int[] prices) {
        int profit=0,buy=prices[0],sell=0;
        for(int i=0;i<prices.length;i++){
            sell=prices[i];
            buy=Math.min(buy,sell);
            if(buy<sell)
                profit=Math.max(profit,prices[i]-buy);
        }
        return profit;    
    }
}






