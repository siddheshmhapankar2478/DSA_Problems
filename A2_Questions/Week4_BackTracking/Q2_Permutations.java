package A2_Questions.Week4_BackTracking;

import java.util.ArrayList;
import java.util.List;

//Method1
// public class Q2_Permutations {
//     static List<List<Integer>> ans=new ArrayList<>();
//     public static void recurr(int index,int[] nums,List<Integer> curr,boolean[] visited) {
//         if(curr.size()==nums.length){
//             ans.add(new ArrayList<>(curr));
//             return;
//         }
//         for(int i=0;i<nums.length;i++){
//             if(visited[i]!=true){
//                 visited[i]=true;
//                 curr.add(nums[i]);
//                 recurr(i+1,nums,curr,visited);
//                 curr.remove(curr.size()-1);
//                 visited[i]=false;
//             }
//         }

//     }
//     public static List<List<Integer>> permute(int[] nums) {
//         List<Integer> curr=new ArrayList<>();
//         boolean[] visited=new boolean[nums.length];
//         recurr(0,nums,curr,visited);
//         return ans;
//     }
//     public static void main(String[] args) {
//         int[] nums={1,2,3};
//         List<List<Integer>> finalAns=permute(nums);
//         System.out.println(finalAns);    
//     }
// }


//Method2
public class Q2_Permutations {
    static List<List<Integer>> ans=new ArrayList<>();
    public static  void recurr(int index,int[] nums) {
        if(index==nums.length){
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) {
                perm.add(num);
            }
            ans.add(perm);
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            recurr(index+1,nums);
            swap(nums,index,i);
        }

    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static List<List<Integer>> permute(int[] nums) {
        recurr(0,nums);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> finalAns=permute(nums);
        System.out.println(finalAns);    
    }
}
