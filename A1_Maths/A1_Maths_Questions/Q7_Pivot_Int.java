package A1_Maths.A1_Maths_Questions;
public class Q7_Pivot_Int {
    public static void main(String[] args) {
        
    }
    public int pivotInteger(int n) {
		// Your code goes here
		for(int i=1;i<=n;i++){
			int firstHalf=i*(i+1)/2;
			int secondHalf=(n*(n+1)/2)-((i-1)*(i)/2);
			if(firstHalf==secondHalf)
				return i;
		}
		return -1;
	}
	
	public int pivotIntegerMehod2(int n) {
        double i = Math.sqrt((n * n + n) / 2);
        int ans = (int)Math.floor(i);
        if (ans == i)
            return ans;
        return -1;

    }

}
