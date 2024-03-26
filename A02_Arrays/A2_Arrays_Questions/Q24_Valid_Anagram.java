package A02_Arrays.A2_Arrays_Questions;
import java.util.HashMap;

public class Q24_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character,Integer> h2=new HashMap<>();
        for(int i=0;i<n1;i++){
            char current=s.charAt(i);
            if(h1.containsKey(current))
                h1.put(current,h1.get(current)+1);
            else
                h1.put(current,1);
        }
        for(int i=0;i<n2;i++){
            char current=t.charAt(i);
            if(h2.containsKey(current))
                h2.put(current,h2.get(current)+1);
            else
                h2.put(current,1);
        }
        return h1.equals(h2);
    }

    public boolean isAnagram2(String s, String t) {
        int[] characterSet=new int[26];
        int n1=s.length();
        int n2=t.length();
        for(int i=0;i<n1;i++){
            char ch=s.charAt(i);
            characterSet[ch-97]++;
        }
        for(int i=0;i<n2;i++){
            char ch=t.charAt(i);
            characterSet[ch-97]--;
        }
        for(int i=0;i<characterSet.length;i++){
            if(characterSet[i]!=0)
                return false;
        }
        return true;
    }

}



