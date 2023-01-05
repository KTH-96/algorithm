package leetcode;

public class Lc687 {
    int result = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return result;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);

        int leftVal = 0;
        int rightVal = 0;

        if (node.left != null && node.val == node.left.val) {
            leftVal = left + 1;
        }
        if (node.right != null && node.val == node.right.val) {
            rightVal = right + 1;
        }
        result = Math.max(result, leftVal + rightVal);
        return Math.max(leftVal, rightVal);
    }

    public class TreeNode {
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
}
