package A1_Concept.Week1_Maths;
public class Q4_Palindrome {
        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
            
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                
                left++;
                right--;
            }
            
            return true;
        }
        
        public static void main(String[] args) {
            String word = "racecar";
            
            if (isPalindrome(word)) {
                System.out.println("The word is a palindrome.");
            } else {
                System.out.println("The word is not a palindrome.");
            }
        }
       
}
