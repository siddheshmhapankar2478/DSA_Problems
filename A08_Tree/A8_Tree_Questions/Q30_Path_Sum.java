package A08_Tree.A8_Tree_Questions;

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
public class Q30_Path_Sum {
    public boolean preorder(TreeNode root, int targetSum, int sum) {
        if(root==null)
            return false;
        sum+=root.val;
        if(root.left == null && root.right == null)
            return sum==targetSum;
        if(preorder(root.left,targetSum,sum))
            return true;
        if(preorder(root.right,targetSum,sum))
            return true;      
        return false;  
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(preorder(root,targetSum,0))
            return true;
        return false;
    }
}




