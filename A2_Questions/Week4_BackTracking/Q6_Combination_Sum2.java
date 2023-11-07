package A2_Questions.Week4_BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q6_Combination_Sum2 {
    List<List<Integer>> ans=new ArrayList<>();
    public void recurr(int index,int[] candidates, int target,List<Integer> curr) {
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index&&candidates[i]==candidates[i-1])                                                            
                continue;
            if(candidates[i]>target)
                break;
            curr.add(candidates[i]);
            recurr(i+1,candidates,target-candidates[i],curr);
            curr.remove(curr.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> curr=new ArrayList<>();
        recurr(0,candidates,target,curr);
        return ans;
    }
    public static void main(String[] args) {
        Q6_Combination_Sum2 q = new Q6_Combination_Sum2();
        System.out.println(q.combinationSum2(new int[]{10,1,2,7,6,1,5},8));
    }
}
