package A02_Arrays.A2_Arrays_Concept;

import java.util.ArrayList;
import java.util.List;

public class Q7_Merge_Two_Sorted_Array {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans.add(a[i]);
                i++;
            } else if(b[j]<a[i]){
                ans.add(b[j]);
                j++;
            }
            else{
                int val=a[i];
                ans.add(val);
                while(a[i]==val)
                    i++;
                while(b[j]==val)
                    j++;
            }

        }
        while (i < a.length) {
            ans.add(a[i]);
            i++;
        }
        while (j < b.length) {
            ans.add(b[j]);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 3 };
        int[] b = { 2, 2, 4 };
        System.out.print(sortedArray(a, b));
    }

}
