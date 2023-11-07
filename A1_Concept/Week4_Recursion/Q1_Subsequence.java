package A1_Concept.Week4_Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q1_Subsequence {
    static List<List<Integer>> ans=new ArrayList<>();
    public static void subSequence(int[] arr,int i, List<Integer> curr) {
        if(i==arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        subSequence(arr, i+1,curr);
        curr.add(arr[i]);
        subSequence(arr, i+1,curr);
        curr.remove(curr.size()-1);
    }
    public static void main(String[] args) {
        int[] arr={3,1,2};
        List<Integer> curr=new ArrayList<>();
        subSequence(arr,0,curr);
        System.out.println(ans);
    }
}
