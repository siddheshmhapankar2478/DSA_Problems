package A0_Questions.A8_Tree_Questions;

public class Q17_Merge_2_Bt {
    public static void main(String[] args) {

    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return null;
        if (root1 == null && root2 != null)
            return root2;
        if (root1 != null && root2 == null)
            return root1;
        int val1 = root1.val;
        int val2 = root2.val;
        TreeNode root3 = new TreeNode(val1 + val2);
        root3.left = mergeTrees(root1.left, root2.left);
        root3.right = mergeTrees(root1.right, root2.right);
        return root3;
    }
}
