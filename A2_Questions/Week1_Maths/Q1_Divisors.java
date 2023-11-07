import java.util.ArrayList;
import java.util.List;

public class Q1_Divisors {
    public static List<Integer> getDivisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                if (i != number / i) {
                    divisors.add(number / i);
                }
            }
        }
        return divisors;
    }
    
    public static void main(String[] args) {
        int number = 12;
        List<Integer> divisors = getDivisors(number);
        
        System.out.println("Divisors of " + number + ":");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }
}




