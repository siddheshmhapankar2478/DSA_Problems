package A2_Questions.Week4_Recursion;

public class Q4_Climbing_Stairs {
    public static void main(String[] args) {
        
    }
    
    public static int rec(int n, int[] arr) {
        if (n <= 0)
            return 0;
        if (n ==1||n== 2) {
            arr[n] = n;
            return n;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        
        int one = rec(n - 1, arr);
        int two = rec(n - 2, arr);
        arr[n] = one + two;
        
        return arr[n];
    }
    
}
