// package A05_2D_Arrays.A5_2DAarray_Questions;

// import java.util.ArrayList;
// import java.util.List;

// public class Q13_Next_Permutation {
//     static List<List<Integer>> ans=new ArrayList<>();
//     public static void permutation(int i,int[] num, List<Integer> curr) {
//         if(i==num.length)
//             return;
//         if (curr.size() == num.length){
//             ans.add(new ArrayList<>(curr));
//             return;
//         } 
//         permutation(i+1,num, curr);
//         curr.add(num[i]);
//         permutation(+1, num, curr);
//         curr.remove(curr.size()-1);
//     }
//     public static void main(String[] args) {
//         int[] num = new int[]{4, 9, 8};
//         List<Integer> curr=new ArrayList<>();
//         permutation(0,num, curr,visited);
//         System.out.println(ans);
//     }
// }
