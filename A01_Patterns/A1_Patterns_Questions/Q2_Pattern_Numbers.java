package A01_Patterns.A1_Patterns_Questions;

public class Q2_Pattern_Numbers {
    public static void main(String[] args) {
        int n = 5;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        pattern5(n);
        patternSpace1(n);
    }

    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int row = n; row >= 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            int i = row % 2;
            for (int col = 1; col <= row; col++) {
                System.out.print(i++ % 2);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        int count = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void patternSpace1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
