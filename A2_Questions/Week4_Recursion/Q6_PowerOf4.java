package A2_Questions.Week4_Recursion;

public class Q6_PowerOf4 {
    public static void main(String[] args) {
        
    }
    public boolean isPowerOfFour(int n) {
		if(n==1)
			return true;
		if(n%4!=0||n<=0)
			return false;
		if(n%4==0){
			n=n/4;
			return isPowerOfFour(n);
		}
		return false;
	}
}
