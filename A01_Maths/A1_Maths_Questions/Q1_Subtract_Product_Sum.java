package A01_Maths.A1_Maths_Questions;
public class Q1_Subtract_Product_Sum {
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1, digit = 0;
        while (n != 0) {
            digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        Q1_Subtract_Product_Sum q = new Q1_Subtract_Product_Sum();
        System.out.println("Result: " + q.subtractProductAndSum(234));
    }
}
