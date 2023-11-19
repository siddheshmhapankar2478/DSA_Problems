package A01_Maths.A1_Maths_Questions;
import java.util.Arrays;

public class Q2_Min_Sum_of_4_DigitNum {
    public int minimumSum(int num) {
		int i=0;
		int[] arr=new int[4];
		while(num!=0){
			int digit=num%10;
			arr[i]=digit;
			num=num/10;
			i++;
		}
		Arrays.sort(arr);
		int num1=arr[0]*10+arr[2];
		int num2=arr[1]*10+arr[3];
		return num1+num2;
	}
    public static void main(String[] args) {
        Q2_Min_Sum_of_4_DigitNum q = new Q2_Min_Sum_of_4_DigitNum();
        System.out.println("The minimum sum of 4-digit number is " + q.minimumSum(9876));
    }
}
