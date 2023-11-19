package A04_Recursion.A4_Recursion_Questions;

public class Q1_PowXN {
    public static void main(String[] args) {

    }

    public double myPow(double x, int n) {
        if (n == 0)
            return 1.0;
        if (n < 0) {
            x = 1 / x;
            if (n == Integer.MIN_VALUE) {
                x *= x;
                n = -(n / 2);
            }
            else
            n = -n;
        }
        return powRecursive(x, n);
    }

    public double powRecursive(double x, int n) {
        if (n == 0)
            return 1.0;

        double halfPow = powRecursive(x, n / 2);
        double result = halfPow * halfPow;

        if (n % 2 == 1)
            result *= x;

        return result;
    }
}
