package A02_Arrays.A2_Arrays_Questions;
import  java.util.List;
import  java.util.ArrayList;
import  java.util.HashSet;
import  java.util.Collections;

public class Q23_Leaders_in_Array {
    public static void main(String[] args) {
        Q23_Leaders_in_Array q=new Q23_Leaders_in_Array();
        int[] a={1,2,3,2};
        List< Integer > ans=q.superiorElements(a);
        System.out.println(ans);
        
    }
    public List< Integer > superiorElements(int []a) {
        int n=a.length;
        HashSet< Integer > hs=new HashSet<>();
        List< Integer > ans=new ArrayList<>();
        int max=a[n-1];
        hs.add(a[n-1]);
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,a[i]);
            if(a[i]==max)
                hs.add(a[i]);
        }
        for(Integer i: hs){
            ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
}
