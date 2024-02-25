package A02_Arrays.A2_Arrays_Questions;
import java.util.List;
import java.util.ArrayList;

public class Q21_Find_Union {
    public static void main(String[] args) {
        
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i!=a.length&&j!=b.length){
            if(i!=a.length&&j!=b.length&&a[i]==b[j]){
                if(!ans.contains(a[i]))
                    ans.add(a[i]);
                i++;
                j++;
            }
            if(i!=a.length&&j!=b.length&&a[i]<b[j]){
                if(!ans.contains(a[i]))
                    ans.add(a[i]);
                i++;
            }
            if(i!=a.length&&j!=b.length&&b[j]<a[i]){
                if(!ans.contains(b[j]))
                    ans.add(b[j]);
                j++;
            }
        }
        while(i!=a.length){
            if(!ans.contains(a[i]))
                ans.add(a[i]);
            i++;
        }
        while(j!=b.length){
            if(!ans.contains(b[j]))
                ans.add(b[j]);
            j++;
        }
        return ans;
    }
}
