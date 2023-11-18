package A0_Questions.A5_Sorting_Questions;

public class Q6_Monk {
    public static void main(String[] args) {
        
    }

    public static int[] niceStrings(String[] A) {
        int[] ans = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[j].compareTo(A[i]) < 0) {
                    ans[i]++;
                }
            }
        }

        return ans;
	}
}
