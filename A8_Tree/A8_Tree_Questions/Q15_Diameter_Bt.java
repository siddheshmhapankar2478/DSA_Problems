package A0_Questions.A8_Tree_Questions;

public class Q15_Diameter_Bt {
    public static void main(String[] args) {

    }
    int max = 0;
    public int heightBT(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int left = heightBT(root.left);
        int right = heightBT(root.right);
        max = Math.max(max, left + right);
        return 1 + Math.max(left, right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        heightBT(root);
        return max;
    }
}
