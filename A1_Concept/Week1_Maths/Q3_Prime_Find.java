package A1_Concept.Week1_Maths;
public class Q3_Prime_Find {
        public static void main(String[] args) {
            int number = 17;
            boolean isPrime = true;
            
            if (number <= 1) {
                isPrime = false;
            }
            
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println("The number is prime.");
            } else {
                System.out.println("The number is not prime.");
            }
        }
}



