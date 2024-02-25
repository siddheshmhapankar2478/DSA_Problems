package A02_Arrays.A2_Arrays_Questions;

public class Q7_Best_Time_To_Buy {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        Q7_Best_Time_To_Buy q=new Q7_Best_Time_To_Buy();
        int ans=q.maxProfit2(prices);
        System.out.println(ans);
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] maxPrice=new int[n]; 
        maxPrice[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            maxPrice[i]=Math.max(maxPrice[i+1],prices[i]);
        }
        int profit=0,maxiProfit=0;
        for(int i=0;i<n;i++){
            profit=maxPrice[i]-prices[i];
            maxiProfit=Math.max(maxiProfit,profit);
        }
        return maxiProfit;
    }
    public int maxProfit2(int[] prices) {
        int n=prices.length;
        int maxPrice=prices[n-1];
        int profit=0,maxiProfit=0;
        for(int i=n-2;i>=0;i--){
            maxPrice=Math.max(maxPrice,prices[i]);
            profit=maxPrice-prices[i];
            maxiProfit=Math.max(maxiProfit,profit);
        }
        return maxiProfit;
    }
}






