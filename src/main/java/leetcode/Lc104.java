package leetcode;

public class Lc104 {
    public int maxDepth(TreeNode root) {
        return solve(root, 0);
    }

    private int solve(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        return Math.max(solve(node.left, depth + 1), solve(node.right, depth + 1));
    }
    static class TreeNode {
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
}
