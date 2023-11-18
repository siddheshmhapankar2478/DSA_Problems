package A0_Questions.A3_Number_System_Questions;

public class Q6_Exceptionally_Odd {
    public static void main(String[] args) {
        
    }
    public int getOddOccurrence(int[] arr) {
		int ans=0;
		for(int ele:arr){
			ans=ans^ele;
		}
		return ans;
	}
}
