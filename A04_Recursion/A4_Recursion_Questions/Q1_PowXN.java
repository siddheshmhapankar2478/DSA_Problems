package A04_Recursion.A4_Recursion_Questions;

public class Q1_PowXN {
    public static void main(String[] args) {
        Q1_PowXN q=new Q1_PowXN();
        System.out.println(q.myPow(2, 9));
    }

    public double myPow(double x, int n) {
        if(n<0){
            x=1/x;
            if (n == Integer.MIN_VALUE) {
                x *= x;
                n = -(n / 2);
            }
            else
                n=-n;    
        }
        if(n==0)
            return 1;
        if(n==1)
            return x;
        double halfPower=myPow(x, n/2);
        if(n%2==0)
            return halfPower*halfPower;
        else
            return x*halfPower*halfPower;

    }

}
