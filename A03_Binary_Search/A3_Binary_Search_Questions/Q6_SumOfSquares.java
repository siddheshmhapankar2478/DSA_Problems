package A03_Binary_Search.A3_Binary_Search_Questions;

public class Q6_SumOfSquares {
    public static void main(String[] args) {
        
    }
    public boolean judgeSquareSum(int c) {
		// Your code goes here
		long start=0,end=(int)Math.sqrt(c);
		while(start<=end){
			if((start*start)+(end*end)==c)
				return true;
			else if((start*start)+(end*end)>c)
				end--;
			else
				start++;
		}
		return false;

	}
}
