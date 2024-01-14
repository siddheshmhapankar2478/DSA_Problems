package A04_Backtracking.A4_BackTracking_Questions;

import java.util.ArrayList;
import java.util.List;

public class Q1_Subsets {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalAns=new ArrayList<List<Integer>>();
        List<Integer> currentSubset=new ArrayList<Integer>();
        return recursion(0,nums,currentSubset,finalAns);
    }
    public List<List<Integer>> recursion(int index,int[] nums,List<Integer>currentSubset,List<List<Integer>>finalAns) {
        if(index==nums.length){
            finalAns.add(new ArrayList<Integer>(currentSubset));
            return finalAns;
        }
        recursion(index+1,nums,currentSubset,finalAns);
        currentSubset.add(nums[index]);
        recursion(index+1,nums,currentSubset,finalAns);
         currentSubset.remove(currentSubset.size() - 1); // Remove added element to backtrack
        return finalAns;
    }
}






