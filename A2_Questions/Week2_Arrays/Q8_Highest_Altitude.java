package A2_Questions.Week2_Arrays;

public class Q8_Highest_Altitude {
    public static void main(String[] args) {
        
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
