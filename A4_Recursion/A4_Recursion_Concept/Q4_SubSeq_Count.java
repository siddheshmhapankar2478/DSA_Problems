package A4_Recursion.A4_Recursion_Concept;

import java.util.ArrayList;
import java.util.List;

public class Q4_SubSeq_Count {
    static List<List<Integer>> ans=new ArrayList<>();
    public static int printCountSubsequenceK(int n, int k,int []a) {
        List<Integer> curr=new ArrayList<>();
        int sum=0;
        int answer=subSequence(0,a,curr,sum,k);
        return answer;
    }
    public static int subSequence(int i,int[] nums,List<Integer> curr,int sum,int k) {
        if(i==nums.length){
            if(sum==k){
                ans.add(new ArrayList<>(curr));
                return 1;
            }
            return 0;
        }
        int l=subSequence(i+1, nums, curr,sum,k);
        curr.add(nums[i]);
        sum+=nums[i];
        int r=subSequence(i+1, nums, curr,sum,k);
        curr.remove(curr.size()-1);
        sum-=nums[i];
        return l+r;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=5;
        int answer=printCountSubsequenceK(n,k,arr);
        System.out.println(answer);
    }

}
