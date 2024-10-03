package A02_Strings.A2_Strings_Questions;

public class Q2_Reverse_Words_In_Str {
    public static void main(String[] args) {
        
    }
	public static String reverseString(String str) 
	{
		String[] words=str.split(" ");
		int start=0,end=words.length-1;
		while(start<end){
			while(words[start]==" ")
				start++;
			while(words[end]==" ")
				end--;
			String temp=words[start];
			words[start]=words[end];
			words[end]=temp;
			start++;
			end--;
		}
		StringBuilder ans=new StringBuilder("");
		for(String word:words){
			ans.append(word);
			ans.append(" ");
		}
		return ans.toString();
	}
    public String reverseWords(String s) {
        String[] words=s.split(" ");
		int start=0,end=words.length-1;
		while(start<end){
			while(words[start]==" ")
				start++;
			while(words[end]==" ")
				end--;
			String temp=words[start];
			words[start]=words[end];
			words[end]=temp;
			start++;
			end--;
		}
		StringBuilder ans=new StringBuilder("");
		for(String word:words){
            if(word!=""){
                ans.append(word);
                ans.append(" ");
            }
		}
		return ans.toString().trim();
    }
}
