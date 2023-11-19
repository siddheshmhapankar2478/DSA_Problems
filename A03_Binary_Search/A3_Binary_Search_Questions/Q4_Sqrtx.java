package A03_Binary_Search.A3_Binary_Search_Questions;

public class Q4_Sqrtx {
    public static void main(String[] args) {
        
    }
    public int mySqrt(int x) {
		// Your code goes here
        long start=1,end=x,ans=0;
        while(start<=end){
            long mid=(start+end)/2;
            long square=(long)mid*mid;
            if(square<=x){
                ans=mid;
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return (int)ans;
	}
}
