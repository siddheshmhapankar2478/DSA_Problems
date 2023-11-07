package A2_Questions.Week3_Binary_Search;

public class Q3_Koko_Banana {
    public static void main(String[] args) {
        
    }
    public static int requiredHours(int[] piles, int speed) {
        int reqHrs=0;
        for(int i=0;i<piles.length;i++){
                reqHrs+=Math.ceil((double)piles[i]/(double)speed);
            }
        return reqHrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed=1,maxSpeed=Integer.MIN_VALUE,ans=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>maxSpeed)
                maxSpeed=piles[i];
        }
        int start=minSpeed,end=maxSpeed;
        while(start<=end){
            int mid=(start+end)/2;
            int reqHrs=requiredHours(piles,mid);
            if(reqHrs>h){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
}

