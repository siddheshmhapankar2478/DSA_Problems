package A1_Concept.Week8_Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

class NArrayTreeNode {
    int data;
    List<NArrayTreeNode> children;

    public NArrayTreeNode() {
    }

    public NArrayTreeNode(int data) {
        this.data = data;
    }

    public NArrayTreeNode(int data, List<NArrayTreeNode> children) {
        this.data = data;
        this.children = children;
    }
}

public class Q1_Tree_Implementation {
    // Q1 Maximum Depth of Binary Tree
    public int maxDepth(TreeNode root) {
        int max = 0;
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = 1 + Math.max(left, right);
        return max;
    }

    // Q2 Same Tree
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p != null && q != null && p.val == q.val) {
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            return left && right;
        }
        return false;
    }

    // Q3 Binary Tree Preorder Traversal
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.peek();
            if (temp == null)
                break;
            stack.pop();
            ans.add(temp.val);
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
        return ans;
    }

    public static void preorder(TreeNode root, List<Integer> arr) {
        if (root == null)
            return;
        arr.add(root.val);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        preorder(root, arr);
        return arr;
    }

    // Q4 Binary Tree Postorder Traversal
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode current = root;
        while (!stack.isEmpty()) {
            current = stack.peek();
            if (current == null)
                break;
            if (current.left != null) {
                stack.push(current.left);
                current.left = null;
            } else if (current.right != null) {
                stack.push(current.right);
                current.right = null;
            } else {
                ans.add(current.val);
                stack.pop();
            }
        }
        return ans;
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        postorder(root, arr);
        return arr;
    }

    public static void postorder(TreeNode root, List<Integer> arr) {
        if (root == null)
            return;
        postorder(root.left, arr);
        postorder(root.right, arr);
        arr.add(root.val);
    }

    // Q5 Binary Tree Inorder Traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr;
    }

    public static void inorder(TreeNode root, List<Integer> arr) {
        if (root == null)
            return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    // Q6 Binary Tree Level Order Traversal
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> current = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                int ele = q.peek().val;
                current.add(ele);
                if (q.peek().left != null)
                    q.add(q.peek().left);
                if (q.peek().right != null)
                    q.add(q.peek().right);
                q.poll();
            }
            ans.add(current);
        }
        return ans;
    }

    // Q7 Nary Tree Preorder Traversal
    class Solution7 {
        public void recurr(Node root, List<Integer> ans) {
            if (root == null)
                return;
            ans.add(root.val);
            for (int i = 0; i < root.children.size(); i++) {
                recurr(root.children.get(i), ans);
            }
        }

        public List<Integer> preorder(Node root) {
            List<Integer> ans = new ArrayList<>();
            recurr(root, ans);
            return ans;
        }
    }

    // Q8 Nary Tree Postorder Traversal
    class Solution8 {
        public List<Integer> postorder(Node root) {
            List<Integer> ans = new ArrayList<>();
            recurr(root, ans);
            return ans;
        }

        public void recurr(Node root, List<Integer> ans) {
            if (root == null)
                return;
            for (int i = 0; i < root.children.size(); i++) {
                recurr(root.children.get(i), ans);
            }
            ans.add(root.val);
        }
    }

    // Q9 Nary Tree Level Order Traversal
    class Solution9 {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null)
                return ans;
            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                int levelSize = q.size();
                List<Integer> current = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {
                    if (q.peek().children != null) {
                        current.add(q.peek().val);
                        for (int j = 0; j < q.peek().children.size(); j++) {
                            q.offer(q.peek().children.get(j));
                        }
                        q.poll();
                    }
                }
                ans.add(current);
            }
            return ans;
        }
    }

    // Q10 Binary Tree Zigzag Level Order Traversal
    class Solution10 {
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

    // Q11 Maximum Depth of N-ary Tree
    public int maxDepth(NArrayTreeNode root) {
        int max = 1;
        if (root == null) {
            return 0;
        }

        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                max = Math.max(max, 1 + maxDepth(root.children.get(i)));
            }
        }
        return max;
    }

    // Q12 Minimum Depth of Binary Tree
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while (!q.isEmpty()) {
            int levelSize = q.size();
            level++;
            for (int i = 0; i < levelSize; i++) {
                if (q.peek().left == null && q.peek().right == null)
                    return level;
                if (q.peek().left != null)
                    q.add(q.peek().left);
                if (q.peek().right != null)
                    q.add(q.peek().right);
                q.poll();
            }
        }
        return level;
    }

    // Q13 Balanced Binary Tree
    class Solution13 {
        public int height(TreeNode root) {
            if (root == null)
                return 0;
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int height = 1 + Math.max(leftHeight, rightHeight);
            return height;
        }

        public boolean isBalanced(TreeNode root) {
            if (root == null)
                return true;
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int diff = Math.abs(leftHeight - rightHeight);
            if (diff < 2 && isBalanced(root.left) && isBalanced(root.right))
                return true;
            return false;

        }
    }

    // Q14 Average of Levels in Binary Tree
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            double sum = 0;
            for (int i = 0; i < levelSize; i++) {
                int ele = q.peek().val;
                sum = sum + ele;
                if (q.peek().left != null)
                    q.add(q.peek().left);
                if (q.peek().right != null)
                    q.add(q.peek().right);
                q.poll();
            }
            ans.add(sum / levelSize);
        }
        return ans;

    }

    // Q15 Diameter of Binary Tree
    class Solution15 {
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

    // Q16 Invert Binary Tree
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode leftBt = invertTree(root.left);
        TreeNode rightBt = invertTree(root.right);
        root.left = rightBt;
        root.right = leftBt;
        return root;
    }

    // Q17 Merge Two Binary Trees
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

    // Q18 Create Binary Tree From Descriptions
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> hm = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();
        for (int i = 0; i < descriptions.length; i++) {
            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            boolean isLeft = (descriptions[i][2] == 1) ? true : false;
            TreeNode parentNode = (!hm.containsKey(parent)) ? (new TreeNode(parent)) : (hm.get(parent));
            TreeNode childNode = (!hm.containsKey(child)) ? (new TreeNode(child)) : (hm.get(child));
            children.add(child);
            if (isLeft)
                parentNode.left = childNode;
            else
                parentNode.right = childNode;
            hm.put(parent, parentNode);
            hm.put(child, childNode);
        }
        TreeNode root = null;
        for (int i = 0; i < descriptions.length; i++) {
            int parent = descriptions[i][0];
            if (!children.contains(parent)) {
                root = hm.get(parent);
                break;
            }
        }
        return root;
    }

    // Q19 Construct Binary Tree from Preorder and Inorder Traversal
    class Solution19 {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0;

        public TreeNode recurr(int[] preorder, int start, int end) {
            if (start > end)
                return null;
            TreeNode root = new TreeNode(preorder[i++]);
            int index = hm.get(root.val);
            TreeNode leftBt = recurr(preorder, start, index - 1);
            TreeNode rightBt = recurr(preorder, index + 1, end);
            root.left = leftBt;
            root.right = rightBt;
            return root;
        }

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                hm.put(inorder[i], i);
            }
            return recurr(preorder, 0, preorder.length - 1);

        }
    }

    // Q20 Construct Binary Tree from Preorder and Postorder Traversal
    class Solution20 {
        public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
            return buildTree(preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
        }

        private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] postorder, int postStart,
                int postEnd) {
            if (preStart > preEnd) {
                return null;
            }

            TreeNode root = new TreeNode(preorder[preStart]);

            if (preStart == preEnd) {
                return root;
            }

            int postIdx = postStart;
            while (postorder[postIdx] != preorder[preStart + 1]) {
                postIdx++;
            }

            int leftSubtreeSize = postIdx - postStart + 1;

            root.left = buildTree(preorder, preStart + 1, preStart + leftSubtreeSize, postorder, postStart, postIdx);
            root.right = buildTree(preorder, preStart + leftSubtreeSize + 1, preEnd, postorder, postIdx + 1,
                    postEnd - 1);

            return root;
        }
    }

    // Q21 Binary Tree Pruning
    class Solution21 {
        public boolean containsOne(TreeNode root) {
            if (root == null)
                return false;
            boolean leftContainsOne = containsOne(root.left);
            boolean rightContainsOne = containsOne(root.right);
            if (!leftContainsOne)
                root.left = null;
            if (!rightContainsOne)
                root.right = null;
            return root.val == 1 || leftContainsOne || rightContainsOne;
        }

        public TreeNode pruneTree(TreeNode root) {
            if (root == null)
                return null;
            return containsOne(root) ? root : null;
        }
    }

    // Q22 Search in a Binary Search Tree
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        if (val == root.val)
            return root;
        if (val < root.val)
            return searchBST(root.left, val);
        if (val > root.val)
            return searchBST(root.right, val);
        return null;
    }

    // Q23 Validate Binary Search Tree
    class Solution23 {
        public boolean recurr(TreeNode root, long min, long max) {
            if (root == null)
                return true;
            if (root.val <= min || root.val >= max)
                return false;
            boolean left = recurr(root.left, min, Math.min(max, root.val));
            boolean right = recurr(root.right, Math.max(min, root.val), max);
            return left && right;
        }

        public boolean isValidBST(TreeNode root) {
            long min = Long.MIN_VALUE;
            long max = Long.MAX_VALUE;
            return recurr(root, min, max);
        }
    }

    // Q24 Convert Sorted Array to Binary Search Tree
    class Solution24 {
        public TreeNode recurr(int[] nums, int start, int end) {
            if (start > end)
                return null;
            if (start == end)
                return new TreeNode(nums[start]);
            int mid = (start + end) / 2;
            TreeNode current = new TreeNode(nums[mid]);
            TreeNode leftBST = recurr(nums, start, mid - 1);
            TreeNode rightBST = recurr(nums, mid + 1, end);
            current.left = leftBST;
            current.right = rightBST;
            return current;
        }

        public TreeNode sortedArrayToBST(int[] nums) {
            return recurr(nums, 0, nums.length - 1);
        }
    }

    // Q25 Two Sum IV - Input is a BST
    class Solution25 {
        public void inorder(TreeNode root, ArrayList<Integer> arr) {
            if (root == null) {
                return;
            }
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);

        }

        public boolean findTarget(TreeNode root, int k) {
            ArrayList<Integer> arr = new ArrayList<>();
            inorder(root, arr);
            int start = 0, end = arr.size() - 1;

            while (start < end) {
                int s = arr.get(start);
                int e = arr.get(end);
                if (s + e == k) {
                    return true;
                } else if (s + e < k)
                    start++;
                else
                    end--;
            }
            return false;
        }
    }

    // Q26 Range Sum of Bst
    class Solution26 {
        int total = 0;

        public void inorder(TreeNode root, int low, int high) {
            if (root == null)
                return;
            inorder(root.left, low, high);
            if (root.val >= low && root.val <= high) {
                total += root.val;
            }
            inorder(root.right, low, high);

        }

        public int rangeSumBST(TreeNode root, int low, int high) {
            inorder(root, low, high);
            return total;
        }
    }

    // Q27 Minimum Distance Between BST Nodes
    class Solution27 {
        public void inorder(TreeNode root, ArrayList<Integer> arr) {
            if (root == null)
                return;
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);
        }

        public int minDiffInBST(TreeNode root) {
            ArrayList<Integer> arr = new ArrayList<>();
            inorder(root, arr);
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < arr.size(); i++) {
                int diff = arr.get(i) - arr.get(i - 1);
                min = Math.min(min, diff);
            }
            return min;
        }
    }

    // Q28 Kth Smallest Element in a BST
    class Solution28 {
        int count = 0, ans = -1;

        public void inorder(TreeNode root, int k) {
            if (root == null)
                return;
            inorder(root.left, k);
            count++;
            if (k == count) {
                ans = root.val;
                return;
            }
            inorder(root.right, k);
        }

        public int kthSmallest(TreeNode root, int k) {
            inorder(root, k);
            return ans;
        }
    }

    // Q29 Add One Row to Tree
    class Solution {
        Queue<TreeNode> q = new LinkedList<>();
        int currentDepth = 1;

        public TreeNode addOneRow(TreeNode root, int val, int depth) {
            if (depth == 1) {
                TreeNode newRoot = new TreeNode(val);
                newRoot.left = root;
                return newRoot;
            }
            q.offer(root);
            while (currentDepth < depth - 1) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = q.poll();
                    if (node.left != null)
                        q.offer(node.left);
                    if (node.right != null)
                        q.offer(node.right);
                }
                currentDepth++;
            }
            while (!q.isEmpty()) {
                TreeNode node = q.poll();
                TreeNode newLeft = new TreeNode(val);
                TreeNode newRight = new TreeNode(val);
                newLeft.left = node.left;
                newRight.right = node.right;
                node.left = newLeft;
                node.right = newRight;
            }
            return root;
        }
    }

}
