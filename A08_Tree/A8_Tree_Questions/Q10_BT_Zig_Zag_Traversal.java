package A08_Tree.A8_Tree_Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

public class Q10_BT_Zig_Zag_Traversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return ans;
        q.offer(root);
        int it = 0;
        while (!q.isEmpty()) {
            List<Integer> curr = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (it % 2 == 0)
                    curr.add(node.val);
                else
                    curr.add(0, node.val);

                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }
            ans.add(curr);
            it++;
        }
        return ans;
    }
}
