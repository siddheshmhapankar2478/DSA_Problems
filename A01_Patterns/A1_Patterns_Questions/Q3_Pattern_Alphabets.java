package A01_Patterns.A1_Patterns_Questions;

public class Q3_Pattern_Alphabets {
    public static void main(String[] args) {
        int n=5;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        patternSpace1(n);
    }
    public static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            char ch=65;
            for (int col = 1; col <= row; col++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        for (int row = n; row >= 0; row--) {
            char ch=65;
            for (int col = 1; col <= row; col++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {
        char ch=65;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            char ch=(char)(65+n-row);
            for (int col = 1; col <= row; col++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    public static void patternSpace1(int n) {
        for (int row = 1; row <= n; row++) {
            char ch=65;
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(ch++);
            }
            ch--;
            ch--;
            for (int col = 1; col <= row-1; col++) {
                System.out.print(ch--);
            }
            System.out.println();
        }
    }
}
