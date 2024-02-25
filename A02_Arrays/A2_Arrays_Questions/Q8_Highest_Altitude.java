package A02_Arrays.A2_Arrays_Questions;

public class Q8_Highest_Altitude {
    public static void main(String[] args) {
        Q8_Highest_Altitude q=new Q8_Highest_Altitude();
        int[] gain={-5,1,5,0,-7};
        System.out.println(q.largestAltitude(gain));
    }
    public int largestAltitude(int[] gain) {
        int curr=0,max=Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            curr=curr+gain[i];
            if(curr>max){
                max=curr;
            }
        }
        if(max>0)
            return max;
            return 0;
    }
}
