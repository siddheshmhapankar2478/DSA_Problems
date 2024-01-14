package A03_Number_System.A3_Number_System_Questions;

public class Q8_Xor_L_to_R {
    public static int findXOR(int L, int R){
        int ans=0;
        for(int i=L;i<=R;i++){
            ans=ans^i;
        }
        return ans;
    }
    public static int findXOR2(int L, int R) {
        // Calculate XOR of the range [1, R]
        int xorR = getXOR(R);
        // Calculate XOR of the range [1, L-1]
        int xorLMinus1 = getXOR(L - 1);
        // XOR of the range [L, R]
        return xorR ^ xorLMinus1;
    }
    private static int getXOR(int N) {
        if (N % 4 == 0) {
            return N;
        } else if (N % 4 == 1) {
            return 1;
        } else if (N % 4 == 2) {
            return N + 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        
    }
}
