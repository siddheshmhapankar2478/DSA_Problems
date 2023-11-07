package A2_Questions.Week3_Binary_Search;

public class Q2_Capacity_Ship {
    public static void main(String[] args) {
        
    }
    public static int reqDays(int[] weights,int shipcapacity) {
        int ship=0,days=1;
        for(int i=0;i<weights.length;i++){
            if(ship+weights[i]<=shipcapacity){
                ship=ship+weights[i];
            }
            else{
                days++;
                ship=0;
                ship=ship+weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int minCapacity=Integer.MIN_VALUE,maxCapacity=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>minCapacity){
                minCapacity=weights[i];
            }
            maxCapacity=maxCapacity+weights[i];
        }
        int start=minCapacity,end=maxCapacity,ans=0;
        while (start <= end ){
            int mid=(start+end)/2;
            int requiredDays=reqDays(weights, mid);
            if(requiredDays>days){
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
