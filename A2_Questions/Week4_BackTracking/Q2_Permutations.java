package A2_Questions.Week4_BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_Permutations {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> finalAns=permute(nums);
        System.out.println(finalAns);
        
    }
	public static List<List<Integer>> permute(int[] nums) {
        boolean[] visited=new boolean[nums.length];
        Arrays.fill(visited,false);
        List<List<Integer>> finalAns=new ArrayList<List<Integer>>();
        List<Integer> currentSubset=new ArrayList<>();
        return recursion(nums,currentSubset,finalAns,visited);
    }
    public static List<List<Integer>> recursion(int[] nums,List<Integer>currentSubset,List<List<Integer>>finalAns,boolean[] visited) {
        if(currentSubset.size()==nums.length){
            finalAns.add(new ArrayList<>(currentSubset));
            return finalAns;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                currentSubset.add(nums[i]);
                visited[i]=true;
                recursion(nums,currentSubset,finalAns,visited);
                currentSubset.remove(currentSubset.size() - 1);
                visited[i]=false;

            }
        }
        return finalAns;
	}
}
