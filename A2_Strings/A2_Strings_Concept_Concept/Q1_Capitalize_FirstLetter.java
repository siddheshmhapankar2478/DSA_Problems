package A2_Strings.A2_Strings_Concept_Concept;
public class Q1_Capitalize_FirstLetter {
    public static void main(String[] args) {
        
    }
	public static String convertString(String str) {
        String ans="";
        String[] words=str.split(" ");     
        for(String word:words){
            ans=ans+word.substring(0,1).toUpperCase()+word.substring(1)+" ";
        }
        return ans;
    }
}


