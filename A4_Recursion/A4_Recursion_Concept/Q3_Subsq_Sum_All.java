package A4_Recursion.A4_Recursion_Concept;

import java.util.ArrayList;
import java.util.List;

public class Q3_Subsq_Sum_All {
    static List<List<Integer>> ans=new ArrayList<>();
    public static List<List<Integer>> printSubsequenceK(int n, int k,int []a) {
        List<Integer> curr=new ArrayList<>();
        int sum=0;
        subSequence(0,a,curr,sum,k);
        return ans;

    }
    public static void subSequence(int i,int[] nums,List<Integer> curr,int sum,int k) {
        if(i==nums.length){
            if(sum==k){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        subSequence(i+1, nums, curr,sum,k);
        curr.add(nums[i]);
        sum+=nums[i];
        subSequence(i+1, nums, curr,sum,k);
        curr.remove(curr.size()-1);
        sum-=nums[i];

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=5;
        List<List<Integer>> ans=printSubsequenceK(n,k,arr);
        System.out.println(ans);
    }

}
