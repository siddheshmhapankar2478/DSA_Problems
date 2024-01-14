package A01_Patterns.A1_Patterns_Questions;

public class Q1_PatternStars {
    public static void main(String[] args) {
        int n = 5;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // patternSpace1(n);
        // patternSpace2(n);
        // patternSpace3(n);
        // patternSpace4(n);
        // patternSpace5(n);
        // patternSpace6(n);
        patternSpace7(n);
        patternSpace8(n);
    }

    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int row = n; row >= 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternSpace1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void patternSpace2(int n) {
        int stars = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= stars; col++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
        }
    }

    public static void patternSpace3(int n) {
        int stars = 2 * n - 1;
        for (int row = n; row >=0; row--) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= stars; col++) {
                System.out.print("*");
            }
            System.out.println();
            stars -= 2;
        }
    }
    public static void patternSpace4(int n) {
        patternSpace2(n);
        patternSpace3(n);
    }
    public static void patternSpace5(int n) {
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int space=1;space<=2*(n-row);space++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternSpace6(int n) {
        for(int row=n;row>=0;row--){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int space=1;space<=2*(n-row);space++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternSpace7(int n) {
        patternSpace5(n);
        patternSpace6(n);
    }
    public static void patternSpace8(int n) {
        patternSpace6(n);
        patternSpace5(n);
    }
}
