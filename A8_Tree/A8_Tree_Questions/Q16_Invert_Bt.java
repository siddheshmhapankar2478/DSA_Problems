package A0_Questions.A8_Tree_Questions;

public class Q16_Invert_Bt {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode leftBt = invertTree(root.left);
        TreeNode rightBt = invertTree(root.right);
        root.left = rightBt;
        root.right = leftBt;
        return root;
    }

    public TreeNode invertTree1(TreeNode root) {
        if (root == null)
            return null;
        if (root.left == null && root.right == null)
            return root;
        TreeNode leftBt = root.left;
        TreeNode rightBt = root.right;
        root.left = rightBt;
        root.right = leftBt;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
