package A0_Questions.A4_Recursion_Questions;

public class Q2_Valid_Palindrome {
    public static void main(String[] args) {
        
    }
    public boolean recursivePalindrome(String s,int start,int end) {
        if(start>=end)
            return true;
        if(s.charAt(start)!=s.charAt(end))
            return false;
        return recursivePalindrome(s,start+1,end-1);
        
    }
    public boolean isPalindrome(String s) {
        // Your code goes here
        s=s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        
        return recursivePalindrome(s,0,s.length()-1);
    }
}
