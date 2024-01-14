package A04_Recursion.A4_Recursion_Concept;

import java.util.ArrayList;
import java.util.List;

public class Q5_CombinationSum {
    List<List<Integer>>ans=new ArrayList<>();
    public void recurr(int index,int [] candidates, int target,int sum, List<Integer>curr) {
        if(sum>target)
            return;
        if(index==candidates.length){
            if(sum==target){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        recurr(index+1,candidates,target,sum,curr);
        sum+=candidates[index];
        curr.add(candidates[index]);
        recurr(index,candidates,target,sum,curr);
        sum-=candidates[index];
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>curr =new ArrayList<>();
        recurr(0,candidates,target,0,curr);
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
