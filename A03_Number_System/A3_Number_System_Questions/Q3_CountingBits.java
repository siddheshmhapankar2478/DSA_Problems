package A03_Number_System.A3_Number_System_Questions;

public class Q3_CountingBits {
    public static void main(String[] args) {
        
    }
    public static int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<ans.length;i++) {
            ans[i]=countSetBits(i);
        }
        return ans;
    }
    public static int countSetBits(int n) {
        int ans=0;
        while(n>0){
            ans=ans+(n&1);
            n=n>>1;
        }
        System.out.println(ans);
        return ans;
    }
}
