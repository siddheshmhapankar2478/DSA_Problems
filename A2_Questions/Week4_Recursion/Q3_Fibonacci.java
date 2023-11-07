package A2_Questions.Week4_Recursion;

import java.util.Arrays;

public class Q3_Fibonacci {
    public static void main(String[] args) {
        
    }
    public int fib(int n) {
		// Your code goes here
		int[] arr=new int[n+1];
		Arrays.fill(arr,-1);
		return fibonacci(n,arr);
	}
    public int fibonacci(int n,int[] arr){
			if(n==0||n==1){
				arr[n]=n;
				return n;
			}
			if(arr[n]!=-1){
				return arr[n];
			}
		arr[n]=fibonacci(n-1,arr)+fibonacci(n-2,arr);
		return arr[n];

    }
}
