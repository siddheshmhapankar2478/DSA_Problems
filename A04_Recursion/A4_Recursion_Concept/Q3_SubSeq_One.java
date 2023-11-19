package A04_Recursion.A4_Recursion_Concept;

import java.util.ArrayList;
import java.util.List;

public class Q3_SubSeq_One {
    static List<List<Integer>> ans=new ArrayList<>();
    public static List<List<Integer>> printOneSubsequenceK(int n, int k,int []a) {
        List<Integer> curr=new ArrayList<>();
        int sum=0;
        if(subSequence(0,a,curr,sum,k))
            return ans;
        return ans;
    }
    public static boolean subSequence(int i,int[] nums,List<Integer> curr,int sum,int k) {
        if(i==nums.length){
            if(sum==k){
                ans.add(new ArrayList<>(curr));
                return true;
            }
            return false;
        }
        if(subSequence(i+1, nums, curr,sum,k))
            return true;
        curr.add(nums[i]);
        sum+=nums[i];
        if(subSequence(i+1, nums, curr,sum,k))
            return true;
        curr.remove(curr.size()-1);
        sum-=nums[i];
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1};
        int n=arr.length;
        int k=2;
        List<List<Integer>> ans=printOneSubsequenceK(n,k,arr);
        System.out.println(ans);
    }

}
