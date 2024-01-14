package A02_Strings.A2_Strings_Concept;
import java.util.Stack;

public class Q2_Remove_Outer {
    public static void main(String[] args) {
        
    }
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                if(!st.isEmpty()){
                    sb.append('(');
                }
                st.push('(');
            }            
            
            if(ch==')'){
                st.pop();
                if(!st.isEmpty()){
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}
