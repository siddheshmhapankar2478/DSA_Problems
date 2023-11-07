package A2_Questions.Week4_Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q8_Generate_PAranthesis {
    public static void main(String[] args) {
        int n=2;
        List<String> ans=generateParenthesis(n);
        System.out.println(ans);
    }
	public static void recursion(int open,int close,int n,String current,List<String> ans) {
        if(current.length()==n*2){
            ans.add(current);
            return;
        }
        if(open<n){
            current=current+"(";
            open++;
            recursion(open,close,n,current,ans);
            current = current.substring(0, current.length() - 1); // Backtrack
            open--;
        }
        if(close<open){
            current=current+")";
            close++;
            recursion(open,close,n,current,ans);
            current = current.substring(0, current.length() - 1); // Backtrack
            close--;
        }
    }
	public static List<String> generateParenthesis(int n) {
        String current="";
        int open=0,close=0;
        List<String> ans=new ArrayList<String>();
        recursion(open,close,n,current,ans);
        return ans;
	}
}
