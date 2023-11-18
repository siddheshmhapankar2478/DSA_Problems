package A1_Maths.A1_Maths_Concept;
public class Q2_GCD_LCM {
    public static int calculateHCF(int a, int b) {
        if (b == 0)
            return a;
        return calculateHCF(b, a % b);
    }

    public static int calculateLCM(int a, int b) {
        int hcf = calculateHCF(a, b);
        return (a * b) / hcf;
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}


