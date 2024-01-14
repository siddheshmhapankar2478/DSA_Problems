package A04_Recursion.A4_Recursion_Questions;

import java.util.ArrayList;
import java.util.List;

public class Q10_Print_Non_Consec1_Binary_Strings {

    static List<String> ans = new ArrayList<>();

    public static void recurr(int i, int n, StringBuilder sb,char prev) {
        if (i == n) {
            ans.add(sb.toString());
            return;
        }
        recurr(i + 1, n, sb.append("0"),'0');
        sb.deleteCharAt(sb.length() - 1);
        if(prev!='1'){
            recurr(i + 1, n, sb.append("1"),'1');
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static List<String> generateString(int N) {
        StringBuilder sb = new StringBuilder("");
        recurr(0, N, sb,'0');
        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        List<String> ans = generateString(n);
        for (String s : ans)
            System.out.println(s);
    }

}
