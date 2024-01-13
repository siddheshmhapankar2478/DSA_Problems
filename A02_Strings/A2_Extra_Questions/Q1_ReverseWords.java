package A02_Strings.A2_Extra_Questions;

import java.util.Scanner;

public class Q1_ReverseWords {
    static String reverseStringWordWise(String input) {
        String[] str=input.split(" ");
        StringBuilder ans=new StringBuilder("");
        int i=0;
        for(i=str.length-1;i>=0;i--){
            ans.append(str[i]);
            ans.append(" ");
        }
        return ans.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
