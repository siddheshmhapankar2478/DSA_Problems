package A1_Maths.A1_Maths_Questions;
public class Q4_Three_Divisors {
    public boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i * i != n)
                    count++;
            }
        }

        return (count == 3);
    }

    public static void main(String[] args) {
        Q4_Three_Divisors q = new Q4_Three_Divisors();
        System.out.println("Is 27 having three divisors? " + q.isThree(27));
    }
}
